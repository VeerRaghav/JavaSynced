
public class Session4assignment1 {
 	public static void greyScale(int[][][] image) {
 		int sum=0;
	 	for(int[][] elt1 :image ) {
		for(int[] elt2 :elt1) {
			sum=0;
			for(int elt3: elt2) {
				sum+=elt3;
			}
			sum=sum/3;
			for(int elt3:elt2) {
				elt3=sum;
				System.out.print(elt3+" ");
			}
			
		}System.out.println();
	}
 	}
 	static void printhashcodes(int[][][] image)
 	{
 			for(int[][] elt1 :image ) {
 			for(int[] elt2 :elt1) {
 				/*for(int elt3:elt2) {
 					System.out.print(elt3+" ");
 				}*/
 				System.out.print(elt2+"  ");
 				
 			}System.out.println();
 		}System.out.println();
 		
 	}
 	
 	//rotating 180 degrees left or right does'nt make any difference
 	static void rotateleft180(int a[][][]) {
	 	Session4assignment1.rotateright(a);
	 	Session4assignment1.rotateright(a);
 		
 	}
 	static void rotateright(int a[][][])
 	{       
 			int N=a.length;
 	 	    for (int i = 0; i < N / 2; i++)
 	    {
 	        for (int j = i; j < N - i - 1; j++)
 	        {
 	            int[] temp = a[i][j];
 	            a[i][j] = a[N - 1 - j][i];
 	            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
 	            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
 	            a[j][N - 1 - i] = temp;
 	        }
 	    }
 	}

		public static void main(String[] args) {
			
			
			int[] pixel1 = {00, 01, 02};
		 	int[] pixel2 = {10, 11, 12};
		 	int[] pixel3 = {20, 21, 22};
		 	
		 	int[] pixel4 = {12, 45, 78};
		 	int[] pixel5 = {12, 45, 78};
		 	int[] pixel6 = {12, 45, 78};
		 	
		 	int[] pixel7 = {12, 45, 78};
		 	int[] pixel8 = {12, 45, 78};
		 	int[] pixel9 = {12, 45, 78};

		 	int[][]p1={pixel1, pixel2, pixel3};
		 	int[][]p2={pixel4, pixel5, pixel6};
		 	int[][]p3={pixel7, pixel8, pixel9};
		 	
		 	// Representation of an Image
		 	int[][][] image = {
		 						p1,
		 						p2,
		 						p3
		 					};
		 	
		 	// Assignment: 1. Rotate the Image to Right -> 90 degrees
		 	//			   2. Rotate the Image to Left  -> 180 degrees
		 	//			   3. GrayScale the image
		 	//					for a pixel sum up all values and divide by 3
		 	//				    eg: for pixel1 -> 12+45+78/3 -> 45
		 	//					pixel1 = {45, 45, 45}
		 	//					do it for all pixels on the image
		 	// 			   Hint: Use For Loops :)
		 	
		 	
		 	Session4assignment1.greyScale(image);
		 	
		 	Session4assignment1.printhashcodes(image);
		 	Session4assignment1.rotateright(image);
		 	Session4assignment1.printhashcodes(image);	
		 	
		 	
		 	
	//	 	Session4assignment1.printhashcodes(image);
		 	Session4assignment1.rotateleft180(image);
		 	Session4assignment1.printhashcodes(image);	
		 	
		 	
		
		}

}
