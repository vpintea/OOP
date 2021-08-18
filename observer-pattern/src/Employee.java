import java.util.Date;

public class Employee {

    private String name;
    private Date hireDate;
    private int salary;
    public int employeeID;
    private boolean working = false;

    private static int counter;

    public Employee(String name, Date hireDate, int salary, boolean working){
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;

        employeeID = ++counter;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

}
