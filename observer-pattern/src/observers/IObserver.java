package observers;

import domain.Employee;

public interface IObserver {

    public void callMe(Employee emp, String ms);


}
