class Outer{
	
	int x = 10;
	static int y = 20;
	
	Outer(){
		
		System.out.println("In Outer Constructor");
	}
	class Inner{
		
		Inner(){
			
			System.out.println("In Inner Constructor");
			System.out.println(x);
			System.out.println(y);
			System.out.println(Outer.this.x);
		}
	}
	public static void main(String[] args){
		
		Outer outObj = new Outer();
		Inner obj = outObj.new Inner();
	}
}
