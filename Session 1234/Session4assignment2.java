
public class Session4assignment2 {
	public static void printarray(int[] a) {
		for(int elt : a) {
			System.out.print(elt+ "  ");
			System.out.println(" ");
		}
	}
	
    public static void bubbleSort(int arr[], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }
    static void insertionSort(int arr[],int n){
        
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
	public static void main(String[] args) {
		int[] a1= {5,6,7,8,9,0,4,3,2,1};
		Session4assignment2.printarray(a1);
		Session4assignment2.bubbleSort(a1,a1.length);
		Session4assignment2.insertionSort(a1,a1.length);
		System.out.println();
		Session4assignment2.printarray(a1);
		
		
	}
	
}
