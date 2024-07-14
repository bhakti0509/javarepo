/*
 Q.4.Reverse given array.
 Arr : [1,2,3,4,5]
 N : 5
*/

class ReverseArray{
	
	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,4,5};
		int N = 5;
		int arr1[] = new int[N];

		for(int i = 0; i<N; i++){
			arr1[N-i-1] = arr[i];
		}
		for(int i = 0; i<N; i++){
			System.out.println(arr1[i]);
		}
	}
}
