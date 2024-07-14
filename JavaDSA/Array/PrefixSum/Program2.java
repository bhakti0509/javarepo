/*
Q.1.Given an array of size N and Q numbers of queries.
Query contains two parameters (s,e).
s => Start Index
e => End Index
For all queries, print the sum of all elements from index s to index e.
*/

//Optimized Approach :

import java.util.*;

class PrefixSum{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N = 10; 
		int Q = 3;
		Scanner sc = new Scanner(System.in);
		
		//Declare new array for prefix sum : 
		int psArr[] = new int[N];
		psArr[0] = arr[0];

		for(int i = 1; i<N; i++){
			
			psArr[i] = psArr[i-1]+arr[i];
		}

		int sum = 0;

		System.out.println("Enter start : ");
		int s = sc.nextInt();
                System.out.println("Enter end : ");
		int e = sc.nextInt();

		for(int i = 0; i<Q; i++){

			if(s==0){
				sum = psArr[e];
			}
			else{
				sum = psArr[e]-psArr[s-1];
			}
		}
		System.out.println(sum);
	}
}
