class Outer{
	
	int x = 10;
	Outer(){
		
		System.out.println("Constructor Outer");
	}
	void fun(){
		
		System.out.println("In fun-outer");
	}
	class Inner{
		
		Inner(){
			
			System.out.println("Constructor Inner");
		}
	}
	void run(){
		
		System.out.println("In run-outer");
	}
	public static void main(String[] args){
		
		Outer outObj = new Outer();
		Inner inObj = outObj.new Inner();
		outObj.fun();
		outObj.run();
		System.out.println(outObj.x);
	}
}
