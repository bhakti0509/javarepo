/*
Q.2. Given an integer array of size N.
Build an array leftmax of size N.
Leftmax of i contains the maximum for the index 0 to the index i.
Arr : [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]
N : 10
Leftmax : [-3, 6, 6, 6, 6, 6, 6, 8, 8, 8, 8]
*/

//Optimized approach : 

class LeftMaxArray{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
		int N = arr.length;
		int LeftMax[] = new int[N];
		
		LeftMax[0] = arr[0];
		for(int i = 1; i<arr.length; i++){
			if(LeftMax[i-1]<arr[i])
				LeftMax[i] = arr[i];
			else
				LeftMax[i] = LeftMax[i-1];
		}
		for(int i = 0; i<N; i++){
			
			System.out.print(LeftMax[i]+" ");
		}
		System.out.println();

	}
}
