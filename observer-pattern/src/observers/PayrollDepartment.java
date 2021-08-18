package observers;

import domain.Employee;
import observers.IObserver;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("Payroll Dept notified...");
        System.out.println(msg +" " + emp.getName());
    }
}
