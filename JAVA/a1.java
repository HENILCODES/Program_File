import java.util.*;

class a1 {
    public static void main(String args[]) {
        System.out.println("\t Enter user Detail");
        String user, pass;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter User Name : ");
        user = s.nextLine();
		
        System.out.print("Enter User Password : ");
        pass = s.nextLine();

        System.out.println("User Name : " + user);
        System.out.println("Password : " + pass);
    }
}