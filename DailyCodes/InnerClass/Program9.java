//Static nested inner class :


class Outer{
	
	static int x = 10;
	//int y = 20;  Error

	static void run(){
		
		System.out.println("In method run");
	}
	void fun(){
		
		System.out.println("In method fun");
	}
	static class Inner{
		Inner(){
			
			System.out.println("Inner constructor");
			System.out.println(x);
			//System.out.println(y);
			//fun(); Error
			run();
		}	
	}
}

class Client{

	public static void main(String[] args){
		
		Outer.Inner obj = new Outer.Inner();
	}
}
