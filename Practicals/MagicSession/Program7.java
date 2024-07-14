/*WAP to remove void spaces in the string*/

import java.util.*;

class RemoveVoidSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        char arr1[] = str.toCharArray();
        char result[] = new char[str.length()];

        boolean spaceFlag = false;
        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            if (arr1[i] != ' ') {
                result[index] = arr1[i];
                spaceFlag = false;
            } else {
                if (!spaceFlag) {
                    result[index] = arr1[i];
                    spaceFlag = true;
                }
            }
            index++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
        sc.close();
    }
}