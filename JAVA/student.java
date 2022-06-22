interface exam{
	int i=1,r=1;
	int java=55,Html=88;
	String n="h";
	public void Display_mark();
	public void students(int r,String n);
}
class result implements exam{
	
	public void Display_mark(){
		System.out.println("JAVA ="+java+" HTML ="+Html);
	}

	@Override
	public void students(int r, String n) {
		// TODO Auto-generated method stub
		
	}
}
class student extends result{
	public void students(int r,String n){
		System.out.println("Roll Number : "+r+"\n Name : "+n);
	}
	public static void main(String args[]){
		student s1 = new student();
		s1.students(21,"Henil");
		s1.Display_mark();
	}
}