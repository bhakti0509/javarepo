/*Scope of local and global variables in constructor:

this keyword is used to differentiate local and instance variables 
if variable names are identical. */


class Demo{
	
	int x = 10;
	int y = 20;

	Demo(int x, int y){ //internal representation => Demo(Demo this, int x, int y)

		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(y);
		this.x = x;
		this.y = y;
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
