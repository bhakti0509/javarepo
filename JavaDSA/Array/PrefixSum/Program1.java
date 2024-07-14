/*
Q.1. Given an array of size N and Q numbers of queries.
Query contains two parameters (s,e).
s => Start Index
e => End Index
For all queries, print the sum of all elements from index s to index e.
*/

//Bruteforce approach:

import java.util.*;

class QueryRange{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = 10;
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		System.out.println("Enter start : ");
		int s = sc.nextInt();
		System.out.println("Enter end : ");
		int e = sc.nextInt();
		int Q = 1;
		int sum = 0;

		for(int i = 0; i<Q; i++){
			for(int j = s; j<=e; j++){
				sum = sum+arr[j];
			}
		}
		System.out.println(sum);
	}
}
