import java.util.List;

public class EmployeeManagementSystem {

    public Employee employee;
    List<IObserver> observerList;

    public void notifyAllDepartments(){

        for (IObserver departments : observerList){
            departments.callMe();
        }
    }

    public void registerObserver(IObserver department){

    }

    public void hireNewEmployee(Employee emp){

    }

    public void modifyEmployeeName(int id, String name){

    }

}


