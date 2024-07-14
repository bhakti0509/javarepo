//Super Keyword:

class Parent{
	
	int x = 10;
	static int y = 20;

	Parent(){
		System.out.println("Parent constructor");
	}
	void fun(){
		System.out.println("In fun");
	}
	static void run(){
		System.out.println("In run");
	}
}
class Child extends Parent{
	
	Child(){
		System.out.println("Child constructor");
	}
	public static void main(String[] args){
		
		Child obj = new Child();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}
