class StringDemo{

    public static void main(String[] args){

        String str1 = "Bhakti";
        String str2 = "Satpute";
        String str3 = str1 + str2;
        String str4 = new String("BhaktiSatpute");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}