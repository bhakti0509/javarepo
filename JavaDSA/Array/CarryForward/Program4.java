/*
Q.3.Given an integer array of size N.
Build an array rightmax of size N.
Rightmax of i conatins the maximum for the index i
to the index i-1.

Input array : [-3,6,2,4,5,2,8,-9,3,1]
Output array : [8,8,8,8,8,8,8,3,3,1]
*/

class RightMaxArray{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N = arr.length;

		int RightMax[] = new int[N];

		RightMax[N-1] = arr[N-1];

		for(int i = N-2; i>=0; i--){
			
			if(RightMax[i+1]<arr[i])
				RightMax[i] = arr[i];
			else
				RightMax[i] = RightMax[i+1];
		}
		for(int i = 0; i<N; i++){
			
			System.out.print(RightMax[i]+" ");
		}
		System.out.println();
	}
}
