/*WAP to replace all the 'a' with 'e' in a string.*/

import java.util.*;

class ReplaceChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == 'a') {
                arr[i] = 'e';
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        sc.close();
    }
}