/*
Q.4.Given an character array(lowercase)
Return the count of pair(i,j) such that 

a) i<j

b) arr[i] = 'a'
   arr[j] = 'g'

Input array : ['a','b','e','g','a','g']
Output : 3
*/

//Bruteforce approach

class CharacterArray{
	
	public static void main(String[] args){
		
		char arr[] = new char[]{'a','b','e','g','a','g'};
		int count = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == 'a')
				for(int j = i+1; j<arr.length; j++){
					
					if(arr[j] == 'g')
						count++;
			}
		}
		System.out.println(count);
	}
}
