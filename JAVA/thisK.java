class pen {
    String Col = "g";
    String name;

    void write() {
        System.out.println(name);
    }

    void color() {
        System.out.println(this.Col);
    }
}

public class thisK {
    public static void main(String[] args) {
        pen f = new pen();
        pen f1 = new pen();

        f.write();
        f.Col = "Red";
        f1.Col = "blac";
        f.color();
        f1.color();
        f.name = "G";
        f.write();
        f1.name= "g";
        f1.write();
    }
}
