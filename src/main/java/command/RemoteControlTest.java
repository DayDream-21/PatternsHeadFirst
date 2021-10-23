package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("Living room");
        GarageDoor garageDoor = new GarageDoor();

        GarageDoorOpenCommand garageUp = new GarageDoorOpenCommand(garageDoor);
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(lightOff);
        remote.buttonWasPressed();

        remote.setCommand(garageUp);
        remote.buttonWasPressed();
    }
}
