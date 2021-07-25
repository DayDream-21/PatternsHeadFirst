package Command;

public class GarageDoor {
    public void up() {
        System.out.println("Door is moving up!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Door is open!");
    }

    public void down() {
        System.out.println("Door is moving down!");
    }

    public void stop() {
        System.out.println("Door is stopped!");
    }

    public void lightOn() {
        System.out.println("Garage light is ON!");
    }

    public void lightOff() {
        System.out.println("Garage light is OFF!");
    }
}
