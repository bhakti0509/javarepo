//1 8 3 64 5 216

class Pattern{
	
	public static void main(String[] args){
		
		for(int i=1; i<=6; i++){
			
			if(i%2==0){
			
				System.out.print(i*i*i +" ");
			}
			else{
				System.out.print(i +" ");
			}
		}
		System.out.println();
	}
}
