//Static veriables and instance variables:

class Demo{

	int x = 250;
        static int y = 200;
        String str1 = "Rahul";
        static String str2 = "Ashish";

	public static void main(String[] args){
		
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(y);
		System.out.println(obj.str1);
		System.out.println(str2);
	}
}
