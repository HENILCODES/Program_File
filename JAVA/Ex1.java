// import java.util.*;
class Ex1 extends Thread {
    String name;
    int Rol;
    // Thread T;

    Ex1(int R, String S){
        Rol = R;
        name = S;
        System.out.print("Start");
    }
    public void run(){
        try {
            for (int i = 0; i < 1; i++) {
                System.out.println("Student "+name);
                System.out.println("Roll Number " + Rol);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    public static void main(String[] args) {
        // Scanner Sc = new Scanner(System.in);
        Ex1 E = new Ex1(10, "Henil");
        E.start();
        Ex1 E1 = new Ex1(11, "Raj");
        E1.start();
        Ex1 E2 = new Ex1(12, "Ram");
        E2.start();
        Ex1 E3 = new Ex1(13, "nayan");
        E3.start();
        Ex1 E4 = new Ex1(14, "Dixita");
        E4.start();
    }    
}