package client;

import observers.Customer;

public class CoffeeShop {

    public static void main(String args[]){

        Customer Rob = new Customer("Rob", "Latte");
        Customer Jane = new Customer("Jane", "espresso");

        CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
        coffeeAttendent.takeOrder(Rob);
        coffeeAttendent.takeOrder(Jane);

        coffeeAttendent.prepareDrink(Rob.getDrinkOrdered());
        coffeeAttendent.prepareDrink(Jane.getDrinkOrdered());

        coffeeAttendent.callOutCompletedOrder();

    }

}
