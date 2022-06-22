class h{
	static int a;
	void j(){
		a=7;
		System.out.println(a);
	}
	void k(){
		a++;
		System.out.println(a);
	}
}
class Hello {
	public static void main(String args[]) {
		System.out.println("Hello World");
		h s = new h();
		s.j();
		s.k();
		s.j();
	}
}