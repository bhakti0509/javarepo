//Constructor 

//Constructor can be called implicitly

class Demo{
	
	Demo(){
		System.out.println("In constructor");
	}
	void fun(){
		System.out.println("In method fun");
	}
}

class constructorDemo{
	
	public static void main(String[] args){
		
		System.out.println("Start main");
		Demo obj = new Demo();
		System.out.println("End main");
	}
}
