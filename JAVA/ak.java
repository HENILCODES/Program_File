import java.util.Scanner;

class ex extends Thread{
    int roll[] = new int[3];
    String Name[] = new String[3];
    Scanner SI = new Scanner(System.in);

    ex(){
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Roll Number ");
            roll[i] = SI.nextInt();

            System.out.print("Enter Name ");
            Name[i] = SI.next();
        }
    }
    public void run() {
        try {
            System.out.println(" ");
            for (int i = 0; i < 3; i++) {
                System.out.println(Name[i] + " " + roll[i]);
                Thread.sleep(1000);            
            }
        } catch (Exception e) {
            System.out.println(e);    
        }
    }
}
class ak{
    public static void main(String[] args) {
        ex e = new ex();
        e.start();
    }
}