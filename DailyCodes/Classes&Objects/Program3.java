class Demo{

    int x = 10;
    String str = new String("Bhakti");
    static int y = 20;
    public static void main(String[] args){
        int a = 30;
        int b = 40;
        String str1 = new String("Bhakti");
        System.out.println("In static method");
        Demo obj = new Demo();
        System.out.println(obj.x);
        System.out.println(obj.str);
        System.out.println(y);
        System.out.println(a);
        System.out.println(str1);
    }
}