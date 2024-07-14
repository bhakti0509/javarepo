class Parent{
	
	void marry(){
		
		System.out.println("Alia Bhat");
	}
}
class Demo{
		
	void fun(Parent obj){
			
		obj.marry();
	}
}

class Outer{
	
	public static void main(String[] args){
		
		Demo obj = new Demo();

		/*Parent p = new Parent(){
			
			void marry(){
				
				System.out.println("Deepika");
			}
		};
		obj.fun(p);

				OR...
		*/

		obj.fun(new Parent(){
			
			void marry(){
				
				System.out.println("Deepika");
			}
		});		
	}
}
