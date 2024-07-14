//hidden this reference can be used to diffrentiate objects of same class

class Demo{

	int x = 10;

	Demo(int x){

		System.out.println("IN constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args){
		
		Demo obj1 = new Demo(12);
		Demo obj2 = new Demo(13);
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}
