/*WAP to take two strings input from the user and check whether those string objects are
equal or not if equal print true else false*/

import java.util.*;

class StringEqualsMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string :");
        String str1 = sc.next();
        System.out.println("Enter 2nd string :");
        String str2 = sc.next();

        int count = 0;
        if (str1.length() != str2.length())
            System.out.println("false");

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i))
                    count++;
            }
            if (count == str1.length())
                System.out.println("true");
            else
                System.out.println("false");
        }
        sc.close();
    }
}