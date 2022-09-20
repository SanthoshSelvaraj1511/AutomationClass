package Day5;

public class constructorChaining {
    public String empName;
    public int empSalary;
    public String address;


    public constructorChaining()
    {

        this("santhosh");
    }

    public constructorChaining(String name)
    {

        this(name, 14000);
    }
    public constructorChaining(String name, int sal)
    {

        this(name, sal, "Chennai");
    }
    public constructorChaining(String name, int sal, String addr)
    {
        this.empName=name;
        this.empSalary=sal;
        this.address=addr;
    }

    void disp() {
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSalary);
        System.out.println("Employee Address: "+address);
    }
    public static void main(String[] args)
    {
        constructorChaining obj = new constructorChaining();
        obj.disp();
    }
}
