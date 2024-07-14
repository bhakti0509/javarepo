//Super Keyword:

class Parent{
	
	int x = 10;
	Parent(){
		System.out.println("Parent constructor");
	}
	void fun(){
		System.out.println("In fun-parent");
	}
}
class Child extends Parent{
	
	int x = 20;
	Child(){
		
		System.out.println("Child constructor");
		System.out.println(super.x);
		System.out.println(x);
	}
	void fun(){
		
		System.out.println("In fun-child");
		super.fun();
	}
	public static void main(String[] args){
		
		Child obj = new Child();
		obj.fun();
	}
}
