//Default Access Specifier 

import Access.Scope;

class DemoOne{
	
	int x = 70; //Default access to a variable
}

class DemoTwo{
	
	public static void main(String[] args){
		
		One obj1 = new One();
		System.out.println(obj1.y); //accessing default variable from another
					    //file(Program2.java) present in the same folder

		DemoOne obj2 = new DemoOne();
		System.out.println(obj2.x);

		Scope obj3 = new Scope();
		System.out.println(obj3.z);
	}
}
