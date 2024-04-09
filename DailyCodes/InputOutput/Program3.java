import java.util.Scanner;

class ScannerDemo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		String name = sc.next();
		System.out.print("Enter college name : ");
		String clgName = sc.next();
		System.out.print("Enter Student ID : ");
		int Id = sc.nextInt();
		System.out.print("Enter CGPA : ");
		float marks = sc.nextFloat();
		System.out.println(name);
		System.out.println(clgName);
		System.out.println(Id);
		System.out.println(marks);
	}
}
