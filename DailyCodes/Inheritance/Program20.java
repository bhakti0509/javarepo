//this keyword:

class Demo{
	
	int x = 10;
	Demo(){
		
		System.out.println("In no-arg constructor");
	}
	Demo(int y){
		
		System.out.println("In parameterized constructor");
	}
	public static void main(String[] args){
		
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
	}
}
