//Private Access Specifiers : 

class DemoOne{
	
	private int x = 10;
	int y = 20;

	private void fun(){
		
		System.out.println("In method fun");
	}
	void run(){
		
		System.out.println("In method run");
	}
}

class DemoTwo{
	
	public static void main(String[] args){
		
		DemoOne obj = new DemoOne();
		System.out.println(obj.x); //Error : x has private access in DemoOne
		System.out.println(obj.y);
		obj.fun();  //Error : fun() has private access in DemoOne
		obj.run();
	}
}
