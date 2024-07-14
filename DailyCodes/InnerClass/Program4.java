class Outer{
	
	Outer(){
		
		System.out.println("Outer Constructor");
	}
	class Inner{
		
		Inner(){
			
			System.out.println("Inner constructor");
		}
	}
	public static void main(String[] args){
		
		Outer outObj1 = new Outer();
		Outer outObj2 = new Outer();

		Inner obj = outObj1.new Inner();
	}
}
