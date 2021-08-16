package devices;

public class TV implements Device {

    public TV() {}

    @Override
    public void clickOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void clickOff() {
        System.out.println("TV is OFF");
    }

}
