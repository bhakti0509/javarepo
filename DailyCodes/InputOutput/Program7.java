import java.util.*;

class InputDemo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter society name : ");
		String scname = sc.next();

		System.out.println("Enter wing : ");
		char wing = sc.next().charAt(0);

		System.out.println("Enter flat no. : ");
		int flatNo = sc.nextInt();

		System.out.println("Name : "+name);
		System.out.println("Society name : "+scname);
		System.out.println("Wing : "+wing);
		System.out.println("Flat No : "+flatNo);
	}
}
