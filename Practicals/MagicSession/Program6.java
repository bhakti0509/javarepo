/*WAP to convert all alphabets in the string to uppercase */

import java.util.*;

class ConvertToUppercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String str1 = sc.next();

        char arr[] = str1.toCharArray();

        for (int i = 0; i < str1.length(); i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) ((int) (arr[i] - 32));
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        sc.close();
    }
}