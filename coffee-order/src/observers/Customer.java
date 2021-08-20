package observers;

import observers.WaitingCustomer;

public class Customer implements WaitingCustomer {

    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered){
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    public String getName(){
        return name;
    }

    public String getDrinkOrdered(){
        return drinkOrdered;
    }

    @Override
    public void orderReady(String preparedDrink) {
        if (drinkOrdered.equals(preparedDrink))
            exitStore();
    }

    private void exitStore(){
        System.out.println(name + ": Thank you, I've received my "
                + drinkOrdered + " and leaving the store now...");
    }
}
