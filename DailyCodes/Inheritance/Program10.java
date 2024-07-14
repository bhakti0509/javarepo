class Parent{
	
	int x = 10;
	int y = 20;

	Parent(){
		System.out.println("Parent Constructor");
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
	}
}
