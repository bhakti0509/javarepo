/*
Q.5.Given an array of size N.
Reverse the array without using extra space.
Space complexity : O(N)
*/

class ReverseArray{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{8,4,1,3,9,2,6,7};
		int N = 8;

		int i = 0;
		int j = N-1;

		while(i<j){
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
	
		}
		for(int k = 0; k<N; k++){
			
			System.out.println(arr[k]);
		}
	}
}
