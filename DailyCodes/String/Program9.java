class Stringdemo{

    public static void main(String[] args){

        String str1 = "Madhuri";          //Memory allocated on String Constant Pool
        String str2 = "Vaishnavi";        //SCP
        String str3 = "MadhuriVaishnavi"; //SCP
        String str4 = str1 + str2;        //Memory allocated on heap section

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}