import devices.Device;

public class RemoteControl implements Device {

    private Device device = null;

    public RemoteControl(){}


    public void connect(Device device){
        this.device = device;
        System.out.println("Connected to " + device);
    }

    @Override
    public void clickOn() {
        device.clickOn();
    }

    @Override
    public void clickOff() {
        device.clickOff();
    }


}
