/*
Q.2. Given an integer array of size N.
Build an array leftmax of size N.
Leftmax of i contains the maximum for the index 0 to the index i.
Arr : [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]
N : 10
Leftmax : [-3, 6, 6, 6, 6, 6, 6, 8, 8, 8, 8]
*/

//Brute force approach : 

class LeftmaxArray{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
		int N = 10;
		int LeftMax[] = new int[N];
		for(int i = 0; i<N; i++){
			int MaxEle = Integer.MIN_VALUE;
			for(int j = 0; j<=i; j++){
				if(MaxEle < arr[j]){
					MaxEle = arr[j];
				}
			}
			LeftMax[i] = MaxEle;
		}
		for(int i = 0; i<N; i++){
			if(i<N-1){
				System.out.print(LeftMax[i]+",");
			}else{
				System.out.print(LeftMax[i]);
			}
		}
		System.out.println();
	}
}
