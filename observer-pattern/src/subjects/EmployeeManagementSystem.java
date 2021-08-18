package subjects;

import domain.Employee;
import domain.EmployeeDAO;
import observers.IObserver;
import subjects.ISubject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

    public Employee employee;
    public String msg;
    public EmployeeDAO employeeDAO;
    private List<IObserver> observers;
    private List<Employee> employees;

    public EmployeeManagementSystem(){
        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    public void registerObserver(IObserver o){
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver departments : observers){
            departments.callMe(employee, msg);
        }
    }

    public void hireNewEmployee(Employee emp){
        employee = emp;
        msg = "New hire...";
        employees.add(emp);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String name){
        boolean notify = false;
        for (Employee emp : employees){
            if (id == emp.employeeID){
                emp.setName(name);
                this.employee = emp;
                this.msg = "Employee name has been changed";
                notify = true;
            }
        }
        if(notify) {
            notifyObservers();
        }
    }

}


