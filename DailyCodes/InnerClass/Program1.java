//Normal Inner Class :

class Outer{
	
	class Inner{
		Inner(){
			System.out.println("In inner constructor");
		}
	}
	public static void main(String[] args){
		
		Outer outObj = new Outer();
		Inner obj2 = outObj.new Inner();
		//Inner obj = new Outer().new Inner();
	}
}

