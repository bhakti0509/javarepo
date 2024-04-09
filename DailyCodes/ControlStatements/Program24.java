class InputDemo{
	
	void fun(){
		
		System.out.println("In fun method");
	}
	void gun(){
	
		System.out.println("IN gun method");
	}
	public static void main(String[] args){
	
		System.out.println("In main method");
		InputDemo obj = new InputDemo();
		obj.fun();
		obj.gun();
	}
}
