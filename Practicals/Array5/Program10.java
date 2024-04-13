/*WAP to print the factorial of each element in an array.*/

import java.util.*;

class FactofEle{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    
        for(int i = 0; i<size; i++){
            int fact = 1;
            int num = arr[i];
            for(int j = 1; j<=num; j++){
                fact = fact*j;
            }
            System.out.print(fact);
            if(i<size-1){
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}