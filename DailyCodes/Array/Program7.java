//Way 3 : Initialization of an 1D array

class OneDArray{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{1,2,3,4};
		//int arr[] = new int[4]{1,2,3,4}; Invalid syntax
		//int arr[] = new int[]{}; Valid syntax(Array of 0x0 order)
		
		arr[0] = 70;
		arr[1] = 80;
		arr[2] = 90;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);


	}
}
