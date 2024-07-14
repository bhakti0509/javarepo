//Variable declaration :

class Demo{

	int x;
	Demo(int x){
		this.x = x;
		System.out.println(x);
	}
	void fun(){
		
		System.out.println("In fun");
	}

	public static void main(String[] args){
		Demo obj = new Demo(10);
	}
}
