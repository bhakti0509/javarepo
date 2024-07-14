/*Write a Java program that compares two strings without considering their case
sensitivity.*/

import java.util.*;

class CompareString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string :");
        String str1 = sc.next();
        System.out.println("Enter 2nd string :");
        String str2 = sc.next();

        int count = 0;
        if (str1.length() != str2.length()) {
            System.out.println("false");
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (Character.toLowerCase(str1.charAt(i)) == Character.toLowerCase(str2.charAt(i))) {
                    count++;
                }
            }
            if (count == str1.length()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
    }
}
