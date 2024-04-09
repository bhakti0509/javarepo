//1 8 9 64 25 216


class Pattern{
	
	public static void main(String[] args){
		
		for(int i=1; i<=6; i++){
			
			if(i%2==1){
				
				System.out.print(i*i +" ");
			}
			else{
				System.out.print(i*i*i +" ");
			}
		}
		System.out.println();
	}
}
