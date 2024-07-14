//Public access specifier : Access public variable from another file(i.e Program2.java)

class Two{
	
	public static void main(String[] args){
		
		One obj = new One();
		System.out.println(obj.x);
	}
}
