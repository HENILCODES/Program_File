class A{
   int a;
   int b;
}
class AB extends A{
    void Disp(){
        super.b=56;
        System.out.println(a + " "+b);
    }
}
class inhert{
    public static void main(String arg[]) {
        AB a1 = new AB();
        a1.a=5;
        a1.b=15;
        a1.Disp();
    }
}