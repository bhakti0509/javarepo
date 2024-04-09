class SwitchDemo{
	
	public static void main(String[] args){
		
		int x = 50;
		switch(x){
			
			case 20+30:
				System.out.println("20+30");
				break;
			case 25+25:
                                System.out.println("25+25"); //Error: Duplicate case label
                                break;
			case 50:
                                System.out.println("50");//Error: Duplicate case label
                                break;
			default:
				System.out.println("In default");
		}
	}
}
