/*Q.2. Given an integer array of size N.
 Count the number of elements having atleast 1 element greater than itself.*/
 
class ArrayDemo {

    public static void main(String[] args) {

        int arr[] = new int[] { 2, 5, 1, 4, 0, 8, 7 };
        int N = 7;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
