/*
Q.1. Print maximum element from the given range of an array.
start = 0    end = 3
*/

class MaxEle{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{3,4,5,1,2,7,9,8};
		int e = 3;
		int N = 8;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<e; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println(max);	
	}
}
