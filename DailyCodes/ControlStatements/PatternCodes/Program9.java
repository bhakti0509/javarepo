//A b C d E f G h I j

class Pattern{
	
	public static void main(String[] args){
		
		int ch = 65;	
		for(int i=1; i<=10; i++){
			
			if(i%2==1){
				
				System.out.print((char)ch+" ");
			}
			else{
				
				System.out.print((char)(ch+32)+" ");
			}
			ch++;
		}
		System.out.println();
	}
}

/*
Way:2

class Pattern{

        public static void main(String[] args){

                for(int i=1 ; i<=10; i++){

                        if(i%2==1){

                                System.out.print((char)(i+64)+" ");
                        }
                        else{

                                System.out.print((char)(i+96)+" ");
                        }
                }
                System.out.println();
        }
}
*/
