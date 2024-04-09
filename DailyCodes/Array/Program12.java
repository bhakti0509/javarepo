//2D Array Initialization

class TwoDArray{
	
	public static void main(String[] args){
		
		int arr1[][] = new int[][]{{10,20,30,40},{50,60,70,80}};
		int arr2[][] = new int[][]{{110,120,130},{140,150}};
		//System.out.print(arr1[1][2]); ERROR

		for(int i = 0; i<arr1.length; i++){
			
			for(int j = 0; j<arr1[i].length; j++){
				
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0; i<arr2.length; i++){

                        for(int j = 0; j<arr2[i].length; j++){

                                System.out.print(arr2[i][j] +" ");
                        }
                        System.out.println();
                }

	}
}
