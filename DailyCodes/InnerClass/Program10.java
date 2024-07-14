//Annonymous Inner Class


class Demo{
	
	void fun(){
		
		System.out.println("In fun");
	}
}

class Xyz{
	
	public static void main(String[] args){
		
		new Demo(){
			
			void run(){
				
				System.out.println("In run-Outer$1");
			}
		}.run();
	}
}
