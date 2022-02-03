
			// Assignment: Place the n-queens on the chessboard by taking input form the User
			//			   eg: User says row -> 1 and col -> 1 as input -> replace it with queen
			//			   a total of 4 inputs can be taken to place 4 queens in the chessboard
			//			   no queen can be placed in the same row again or same column again :)
import java.util.Scanner;
public class session3assignment {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int r[]=new int[20],c[]=new int[20];int key=0;
			int a=0;
			do {
				
				r[a]=sc.nextInt();
				c[a]=sc.nextInt();
				System.out.println("onr more? 1 or 0");
				key=sc.nextInt();
				a++;
			}while(key==1 && a<3);
			for(int i=0;i<4;i++)
			{
				System.out.println(r[i]+" "+c[i]);
			}

			int n=sc.nextInt();
			int  k=sc.nextInt();
			char blackSquare = '\u25A1';	// 1
			char whiteSquare = '\u25A0';	// 0
			char queen = '\u2655';
			
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					
					if(i==n&&j==k) {System.out.print(queen+" ");continue;}
					if(i%2==0) {
						char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
						System.out.print(square+" ");
					}else {
						char square = (j % 2) == 0 ? blackSquare : whiteSquare;
						System.out.print(square+" ");
					}
					
				}
				System.out.println();
			}
			
		};
	
}
