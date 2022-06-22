
import p1.Employee;
public class Department extends Employee{
    int dno=840;
    String dname="Marketing";
    public void Disp(){
        System.out.println("Employee Number : " + eno);
        System.out.println("Employee Name : " + ename);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Department Number : " + dno);
        System.out.println("Department Name : " + dname);
    }
    public static void main(String[] ar) {
        Department a = new Department();
        a.Disp();
    }
}
