/*
Q.4.Given an character array(lowercase)
Return the count of pair(i,j) such that 

a) i<j

b) arr[i] = 'a'
   arr[j] = 'g'

Input array : ['a','b','e','g','a','g']
Output : 3
*/

//Optimized Approach :


class CharArray{
	
	public static void main(String[] args){
		
		char arr[] = new char[]{'a','b','e','g','a','g'};
		int N = arr.length;

		int count = 0;
		int pair = 0;

		for(int i = 0; i<N; i++){
			
			if(arr[i] == 'a')
				count++;
			else if(arr[i] == 'g')
				pair = pair + count;
		}
		System.out.println(pair);
	}
}
