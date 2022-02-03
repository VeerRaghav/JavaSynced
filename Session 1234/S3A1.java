//program to understand label break and continue
public class S3A1 {

	public static void main(String[] args) {

		int myFloor = 5;
		label: for(int roll=1;roll<=10;roll++) {		
		for(int floor=1;floor<=10;floor++) {
			System.out.println(" "+roll+") Lift at Floor #"+floor);
			
			if(floor == 1 && roll==5) {
				System.out.println("My Floor Arrived");
				break label; // terminate the loop :)
				
			}else
				{continue label;
			//System.out.println(" Started"); --> unreachable lines bcoz of continue
		//System.out.println("Finished");
				}
		}	
		}
		
	}

}
