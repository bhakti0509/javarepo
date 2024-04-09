//String Constant Pool(SCP) :

class StringDemo{
	
	public static void main(String[] args){
		
		String str1 = "Bhakti";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		String str2 = "Bhakti";
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
	}
}
