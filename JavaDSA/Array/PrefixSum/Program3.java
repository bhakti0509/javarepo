/*
Q.2. In place prefix sum

Problem description : 

- Given an array A of N integers. 
- Construct prefix sum of the array in the given array itself.
- Return an array of integers denoting the prefix sum of the given array.

Problem constraints : 

1 <= N <= 10^5
1 <= A[i] <= 10^3

Example Input : 

Input 1 : 

A = [1,2,3,4,5]

Input 2 :

A = [4,3,2]
*/

import java.util.*;
class PrefixSumArray{

	static int [] ConstructPrefixArr(int arr[]){
		
		
		for(int i = 1; i<arr.length; i++){
			
			arr[i] = arr[i-1]+arr[i];
		}
		return arr;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int N = sc.nextInt();

		System.out.println("Enter array elements : ");
		int arr[] = new int[N];

		for(int i = 0; i<N; i++){
			arr[i] = sc.nextInt();
		}

		arr = ConstructPrefixArr(arr);
		System.out.println("Prefix sum array : ");
		for(int i = 0; i<N ; i++){
			if(i<N-1)
				System.out.print(arr[i]+",");
			else
				System.out.print(arr[i]);
		}
		System.out.println();
	}
}
