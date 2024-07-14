/*WAP to check whether the string is empty or not. 
If not then print the last character of the string */

import java.util.*;

class CheckEmpty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String str1 = sc.nextLine();

        char arr[] = str1.toCharArray();
        int ln = arr.length;
        int count = 0;

        while (ln > 0) {
            count++;
        }
        if (count == 0) {
            System.out.println("String is empty!");
        } else {
            System.out.println(arr[ln - 1]);
        }
        sc.close();
    }
}