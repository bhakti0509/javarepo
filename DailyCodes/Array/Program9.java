//WAP to print sum of elements of an array

import java.util.*;

class ArraySum{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements : ");
		for(int i = 0; i<arr.length; i++){
			
			arr[i] = sc.nextInt();
		
		}
		
		int sum = 0;
		
		System.out.println("Array elements are : ");
		for(int i = 0; i<arr.length; i++){
			
			sum = sum + arr[i];
			System.out.println(arr[i]); 
		}
		System.out.println("Sum of elements of an array is : "+sum);
	}
}

