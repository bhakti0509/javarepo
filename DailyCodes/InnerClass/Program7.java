//Method local inner class :

class Outer{
	
	void fun(){
		
		System.out.println("In method fun");
		
		class Inner{
			
			Inner(){
				
				System.out.println("Constructor Inner");
			}
		}
		Inner obj1 = new Inner();
	}
	public static void main(String[] args){
		
		Outer obj = new Outer();
		obj.fun();
	}
}
