//WAP to take input from the user and print all the characters on by one

import java.util.*;

class StringDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");

		String str = sc.next();

		char arr[] = str.toCharArray();
		int ln = arr.length;

		for (int i = 0; i < ln; i++) {

			System.out.println(arr[i]);
		}
		sc.close();

	}
}
