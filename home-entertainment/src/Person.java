import devices.Projector;
import devices.SurroundSound;
import devices.TV;

public class Person {

    public static void main(String args[]){

        // instantiate remote
        RemoteControl remote = new RemoteControl();

        // instantiate devices to test
        TV tv = new TV();
        SurroundSound sound = new SurroundSound();
        Projector projector = new Projector();

        remote.connect(tv);
        remote.clickOn();
        remote.clickOff();

    }

}
