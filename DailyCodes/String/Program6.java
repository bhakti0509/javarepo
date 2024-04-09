//String Constant Pool :

class StringDemo{
	
	public static void main(String[] args){
		
		String str1 = "Sinhgad";
		String str2 = "Sinhgad";
		String str3 = new String("Sinhgad");
		String str4 = new String("Sinhgad");
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		System.out.println(str2);
                System.out.println(System.identityHashCode(str2));

		System.out.println(str3);
                System.out.println(System.identityHashCode(str3));
		
		System.out.println(str4);
                System.out.println(System.identityHashCode(str4));


	}
}
