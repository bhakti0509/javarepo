//Take input from user:

import java.util.*;

class ArrayDemo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Size of an array = "+arr.length);
		System.out.println("Enter elements of an array : ");
		for(int i = 0; i<arr.length; i++){
			
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i = 0; i<arr.length; i++){

                        System.out.println(arr[i]);
                }

	}
}
