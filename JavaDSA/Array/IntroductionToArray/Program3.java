/*Q.2.Optimized code: 
 Given an integer array of size N.
 Count the number of elements having atleast 1 element greater than itself.*/

class ArrayDemo{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int N = 10;
		int count = 0;

		int maxValue = Integer.MIN_VALUE;

		for(int i = 0; i<N; i++){
			
			if(arr[i] > maxValue){
				
				maxValue = arr[i];
			}
		}

		for(int i = 0; i<N; i++){
			
			if(arr[i] == maxValue){
				
				count++;
			}
		}
		System.out.println(N-count);
	}
}
