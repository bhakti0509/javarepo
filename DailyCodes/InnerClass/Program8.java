class Outer{
	
	void fun(){
		
		class Inner1{
			
			Inner1(){
				
				System.out.println("Class Inner1");
			}
			void run(){
				
				class Inner2{
					
					Inner2(){
						
						System.out.println("Class Inner2");
					}
				}
				Inner2 obj = new Inner2();
			}
		}
		Inner1 obj = new Inner1();
		obj.run();
	}
	public static void main(String[] args){
		
		Outer obj = new Outer();
		obj.fun();
	}
}
