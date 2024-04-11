class StringDemo{

    public static void main(String[] args){

        String str1 = "Madhuri";
        String str2 = "Vaishnavi";
        String str3 = new String("Madhuri");
        String str4 = "MadhuriVaishnavi";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}