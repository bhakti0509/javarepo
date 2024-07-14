class Parent{
	
	int x = 10;
	Parent(){
		System.out.println("Parent constructor");
	}

	void fun(){
		System.out.println("In method fun");
	}
}

class Child extends Parent{
	
	int y = 20;

	Child(){
		System.out.println("Child Constructor");
	}

	void run(){
		System.out.println("In run");
	}

	public static void main(String[] args){
		
		Child obj = new Child();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}
