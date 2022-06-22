
class a {
    int ab(int a){return a*a*a;}
}
class s extends a{

    int a(int a){return a*a;}
}

public class override {
    public static void main(String[] args) {
        System.out.println("Hello");
        s a = new s();

        System.out.println(a.a(2));
        System.out.println(a.ab(2));
    }
}
