//9 B 7 D 5 F 3 H 1

class Pattern{
	
	public static void main(String[] args){
		
		char ch = 'A';

		for(int i=9; i>=1; i--){
			
			if(i%2==1){
				
				System.out.print(i+" ");
			}
			else{
				System.out.print(++ch +" ");
				ch++;
			}
		}
		System.out.println();
	}
}
