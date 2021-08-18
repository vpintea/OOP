package observers;

import domain.Employee;
import observers.IObserver;

public class HRDepartment implements IObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("HR Dept notified...");
        System.out.println(msg +" " + emp.getName());
    }
}
