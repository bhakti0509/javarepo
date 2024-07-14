//Parameterized Constructor: Hidden this reference


class Demo{
	
	int x = 10;
       	int y = 20;

	Demo(int a, int b){
		System.out.println("In constructor");
		x = a;
		y = b;
	}
	void printData(){
		System.out.println(x);
		System.out.println(y);
	}
}

class constructorDemo{
	
	public static void main(String[] args){
		
		Demo obj = new Demo(30,40);
		obj.printData();
	}
}
