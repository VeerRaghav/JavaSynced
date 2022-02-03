		
		// Assignment: 1. Implement Ternary Operators if possible in above scenario
		// 			   2. Whenever a wrong promo code is applied, tell the user whats the right promo code 
		//			   3. implement a use case i.e. Book a Cab by taking OLA/Uber as a case study


import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner Object Construction
		
		System.out.println("Enter an Amount: ");
		double amount = sc.nextDouble(); // to read a double
		
		System.out.println("Enter Promo Code: ");
		//String promoCode = scanner.nextLine(); // to read a String
		int promoCode = sc.nextInt();
		

		
		
		System.out.println("Amount is: "+amount);
		System.out.println("Promo Code is: "+promoCode);
		
		// 2 Promo Codes :)
		
		int JUMBO = 101;   // Flat 50% off for the items worth 200 or more
		int ZOMHELLO = 201; // Flat 60% off for the items worth 159 or more upto 120
		
		//checking if amount is greater than threshold using ternary operator-->1 st question 
		/*String s= (amount >= 159)? " You will get Dicsount" :"No Discount Available";
		System.out.println(s);*/
		
		double fp = 0;
		/*19
		String s= ((promoCode == JUMBO || promoCode == ZOMHELLO) && amount >=200)? "Promo Code Applied Successfully" :"Invalid Promo Code or amount is lesser";
		System.out.println(s);	*/	
		
		if(amount>=200 && promoCode==JUMBO) {
			fp=0.5*amount;
			System.out.println("Promocode JUMBO applied , final price is :"+fp);
		}
		else if(amount>=159 && promoCode==ZOMHELLO) {
			fp=0.4*amount;
			System.out.println("Promocode ZOMHELLO applied , final price is :"+fp);			
		}
		else if(amount<159) {
			System.out.println("Amount is less to apply promocode please add "+(159-amount)+" to eligible for JUMBO or add "+(200-amount)+"to eligible for ZOMHELLO ");
		}
		else if(promoCode!=JUMBO && promoCode!= ZOMHELLO) {
			System.out.println("wrong promocode correct one is either 101 or 201");
		}

		
		System.out.println("Enter amount in your eWallet: ");
		double amount2 = sc.nextDouble(); // to read a double
		
		System.out.println("Enter Promo Code: ");
		//String promoCode = scanner.nextLine(); // to read a String
		int promoCode2 = sc.nextInt();
		
		double fare=200,discount=02;

		final int case1 = 1011; // final is a constant in java
		
		switch (promoCode2) {
			
			//case case1: -> cases cannot be variables :) -> error
			//case 101:	
			case case1:	// -> ok if you mark case1 as final :)
				// Nested if/else
				if(amount2 >= 200) {
					discount = 0.5 * fare;
					System.out.println("Discount is: "+discount);
					System.out.println("Promo Code TAKERIDE Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. book ride if you have "+(200-amount2)+"cash");
				}
				
				break;
				
			case 2011:
				
				// Nested if/else
				if(amount2 >= 159) {
					discount = 0.6 * fare;
					
					if(discount >= 120) {
						discount = 120;
					}
					
					System.out.println("Discount is: "+discount);
					
					System.out.println("Promo Code OFFICEHOURS Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. book ride if you have  "+(159-amount2)+" cash  more");
				}
				
				break;
				
			default:
				System.out.println("Invalid Promo Code");
		}
		
		amount2-= discount;
		System.out.println("remaining balance in your eWallet: \u20b9"+amount2);
		
		// We can have nested switch cases as well :)
		
		sc.close(); // release the memory resources
	}

}
