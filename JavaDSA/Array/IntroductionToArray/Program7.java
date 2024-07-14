/*
Q.6.Print the second largest element from the array.
Arr : [8,4,1,3,9,2,6,7]
*/

class LargestEle{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{8,4,1,3,9,2,6,7};
		int N = arr.length;
		
		int maxEle1 = Integer.MIN_VALUE;
		
		for(int i = 0; i<N; i++){
			if(arr[i]>maxEle1){
				
				maxEle1 = arr[i];
			}
		}

		int maxEle2 = Integer.MIN_VALUE;

		for(int i = 0; i<N; i++){
			
			if(arr[i]<maxEle1 && arr[i]>=maxEle2){
				
				maxEle2 = arr[i];
			}
		}
		System.out.println("Fisrt largest element is : "+maxEle1);
		System.out.println("Second largest element is : "+maxEle2);
	}
}
