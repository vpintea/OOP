package devices;

public class Projector implements Device{

    public Projector(){}

    @Override
    public void clickOn() {
        System.out.println("Projector is ON");
    }

    @Override
    public void clickOff() {
        System.out.println("Projector is OFF");
    }
}
