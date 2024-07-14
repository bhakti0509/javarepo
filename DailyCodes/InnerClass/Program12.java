
class Parent{
	
}

class Child extends Parent{

}

class Demo{
	
	void fun(Parent obj){
		
		System.out.println("In fun-parent");
	}
	void fun(Child obj){
		
		System.out.println("In fun-child");
	}
}

class Outer{
	
	public static void main(String[] args){
		
		Demo obj = new Demo();
		obj.fun(new Parent());
		obj.fun(new Child());
	}
}
