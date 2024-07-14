class Parent{
	
	Parent(){
		
		System.out.println("In parent constructor");
	}
}

class Child extends Parent{
	
	Child(){
		
		System.out.println("In child constructor");
	}
}

class Client{
	
	public static void main(String[] args){
	
		Child obj = new Child();
		System.out.println("End main");
	}
}
