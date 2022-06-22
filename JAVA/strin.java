import java.util.Scanner;
class strin
{
    public static void main(String args[]) {
        int c,n;
        byte[] b;
        char[] ch =new char[10];
        String Nam1,Nam2;
        Scanner ch1 = new Scanner(System.in);
        Scanner ch2 = new Scanner(System.in);
        Scanner num1 = new Scanner(System.in);
        System.out.println("\n Choose Following Option Of String Function");
        System.out.println("\t 1.) Concat() ");
        System.out.println("\t 2.) Uppercase() ");
        System.out.println("\t 3.) Lowercase() ");
        System.out.println("\t 4.) Length() ");
        System.out.println("\t 5.) charAt() ");
        System.out.println("\t 6.) equals() ");
        System.out.println("\t 7.) equalsIgnoreCase() ");
        System.out.println("\t 8.) valueOf() ");
        System.out.println();
        System.out.print("Enter Your Choose : ");
        c = num1.nextInt();

        switch (c) {
            case 1:
                System.out.println("\n Concat Two String For Enter Two Number");
                System.out.print("Enter First String : ");
                Nam1 = ch1.nextLine();
                System.out.print("Enter Second String : ");
                Nam2 = ch2.nextLine();
                System.out.println("First + Second String = "+Nam1.concat(Nam2));
                break;
            case 2:
                System.out.println("\n For Uppercase String");
                System.out.print("Enter Name : ");
                Nam1=ch1.nextLine();
                System.out.println("Uppercase is = "+Nam1.toUpperCase());
                break;
            case 3:
                System.out.println("\n For Lowercase");
                System.out.print("Enter Name : ");
                Nam1=ch1.nextLine();
                System.out.println("Lowercase = "+Nam1.toLowerCase());
                break;
            case 4:
                System.out.println("\n For Length");
                System.out.print("Enter Name : ");
                Nam1=ch1.nextLine();
                System.out.println("Name length is = "+Nam1.length());
                break;
            case 5:
                System.out.println("\n for charAt() ");
                System.out.print("Enter Name : ");
                Nam1=ch1.nextLine();
                System.out.print("Enter index number you want : ");
                n = num1.nextInt();
                System.out.println("Character of in Enter name = "+Nam1.charAt(n));
                break;
            case 6:
                System.out.println(" For String equal() ");
                System.out.print("Enter First Name : ");
                Nam1=ch1.nextLine();
                System.out.print("Enter Second Name : ");
                Nam2 = ch1.nextLine();
                System.out.println("First Name = "+Nam1);
                System.out.println("Second Name = "+Nam2);
                System.out.println("First is equal to Second = "+ Nam1.equals(Nam2));               
                break;
            case 7:
                System.out.println(" For String equal() ");
                System.out.print("Enter First Name : ");
                Nam1=ch1.nextLine();
                System.out.print("Enter Second Name : ");
                Nam2 = ch1.nextLine();
                System.out.println("First Name = "+Nam1);
                System.out.println("Second Name = "+Nam2);
                System.out.println("First is equal to Second = "+ Nam1.equalsIgnoreCase(Nam2));               
                break;              
            case 8:
                System.out.println(" For String equal() ");
                System.out.print("Enter First Name : ");
                Nam1=ch1.nextLine();
                System.out.println("First Name = "+Nam1);
                System.out.println("First is convert Byte = "+b);               
                break;
            default:
               System.out.println("Thank's For Connect Henil ");
        }
    }
}