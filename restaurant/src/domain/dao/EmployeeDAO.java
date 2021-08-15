package domain.dao;

import domain.Employee;

public class EmployeeDAO {

    public void saveEmployee(Employee emp){
//        database.DatabseConnectionManager connectionManager = database.DatabseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
        System.out.println("saved employee to the database" +  emp);
    }

    public void deleteEmployee(Employee emp){
        System.out.println("deleted employee from the database" +  emp);

    }

}
