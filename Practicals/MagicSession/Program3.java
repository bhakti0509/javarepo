/*Take two input strings str1 & str2 from the user and print 0 if both strings are equal else
print the difference between unequal element.*/

import java.util.*;

class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string :");
        String str1 = sc.next();
        System.out.println("Enter 2nd string :");
        String str2 = sc.next();

        int minLength = Math.min(str1.length(), str2.length());
        int count = 0;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i))
                count++;
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}