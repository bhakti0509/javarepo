//Switch case:


class SwitchBooleanDemo{
	
	public static void main(String[] args){
		
		boolean data = true;

		switch(data){
			
			case true: //Error
				System.out.println("True");
				break;

			case false://Error				
				System.out.println("False");	
				break;

			default:
				System.out.println("In default state");
		}
	}
}
