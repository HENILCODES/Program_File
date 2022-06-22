import java.util.*;

class UserExepction extends Exception {
    UserExepction(String name) {
        super(name);
    }
}

class PasswordExepction extends Exception {
    PasswordExepction(String Pass) {
        super(Pass);
    }
}

public class login {
    static void User(String Uname) throws UserExepction {
        if (Uname.isEmpty()) {
            throw new UserExepction("Error : User Name is not Empty");
        } else {
            throw new UserExepction("User Name Currect");
        }
    }

    static void Password(String Pas) throws PasswordExepction {
        if (Pas.length() < 8) {
            throw new PasswordExepction("Enter PassWord Length Greter than 8");
        } else {
            throw new PasswordExepction("Password Currect");
        }
    }

    public static void main(String[] args) {
        Scanner U1 = new Scanner(System.in);
        String Name, Password;
        System.out.print("Enter User Name : ");
        Name = U1.nextLine();
        System.out.print("Enter Password  : ");
        Password = U1.nextLine();
        try {
            User(Name);
        } catch (UserExepction User) {
            System.out.println(User);
        }
        try {
            Password(Password);
        } catch (PasswordExepction Pass) {
            System.out.println(Pass);
        } finally {
            System.out.println("Log in succes");
        }
    }
}
