//Methods of string : WAP without using built-in methods.

/*WAP to concat the strings given by the user and count the 
length of the string after concatenation*/

import java.util.*;

class StringConcat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1 = sc.next();
		System.out.println("Enter 2nd string : ");
		String str2 = sc.next();

		String str3 = str1 + str2;
		System.out.println("String after concatenation : " + str3);

		char arr[] = str3.toCharArray();
		int ln = arr.length;
		int count = 0;

		while (ln > 0) {

			count++;
			ln--;
		}
		System.out.println("Length of the string is " + count);
		sc.close();
	}
}
