import java.util.*;

class Dear extends Exception {
    public Dear(String Ag) {
        super(Ag);
    }
}

public class Voting {
    static void Vote(String name, int age) throws Dear {
        if (age < 18) {
            throw new Dear(name + " your Age " + age + " Not Eligible For Vote");
        } else {
            throw new Dear(name + " Your Age " + age + " You are Now Eligible For Vote");
        }
    }

    public static void main(String[] args) {
        int age;
        String name;
        Scanner s1 = new Scanner(System.in);
        try {
            System.out.print("Enter Name ");
            name = s1.nextLine();
            System.out.print("Enter Age ");
            age = s1.nextInt();
            Vote(name, age);
        } catch (Dear Ae) {
            System.out.println(Ae);
        } finally {
            System.out.println("All Condition Clear Thank you");
        }
    }

}
