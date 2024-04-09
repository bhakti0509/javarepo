import java.io.*;

class InputDemo{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Company Name : ");
		String compName = br.readLine();

		System.out.print("Enter Employee Name : ");
		String empName = br.readLine();

		System.out.print("Enter Employee Id : ");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Company Name : "+compName);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee ID : "+empId);

	}	
}
