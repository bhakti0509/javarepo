/*
 1 2 3
 3 2 1
 1 2 3
 3 2 1
 1 2 3
 3 2 1
*/

class Pattern{
	
	public static void main(String[] args){
		
		for(int i=1; i<=6; i++){

			int num = 3;

			for(int j=1; j<=3; j++){
				
				if(i%2==1){
					
					System.out.print(j+" ");
				}
				else{
					
					System.out.print(num-- +" ");
				}		
			}
			System.out.println();
		}
	}
}
