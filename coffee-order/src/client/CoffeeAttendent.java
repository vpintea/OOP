package client;


import observers.WaitingCustomer;
import observers.Customer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendent {

    private List<WaitingCustomer> customers;
    private List<String> completedDrinks;

    public CoffeeAttendent(){
        customers = new ArrayList<WaitingCustomer>();
        completedDrinks = new ArrayList<String>();
    }


    public void takeOrder(WaitingCustomer customer){
        customers.add(customer);
        System.out.println("Coffee Attendent: '" + customer.getName()
                + ", I've started working on your order of "
                + customer.getDrinkOrdered() + "'");
    }

    public void prepareDrink(String drinkToPrepare){
        completedDrinks.add(drinkToPrepare);
    }

    public void callOutCompletedOrder(){
        for (String drink : completedDrinks){
            for (WaitingCustomer customer : customers){
                customer.orderReady(drink);
            }
        }
    }

}
