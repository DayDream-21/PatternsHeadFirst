package Command;

public class Environment {
}

class GarageDoor extends Environment {

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

class Light extends Environment {

    public void on() {
        System.out.println("Light is ON!");
    }

    public void off() {
        System.out.println("Light is OFF!");
    }
}

class Stereo extends Environment {
    public void on() {
        System.out.println("Stereo is ON!");
    }

    public void off() {
        System.out.println("Stereo is OFF!");
    }

    public void setCd() {
        System.out.println("CD is set!");
    }

    public void setDvd() {
        System.out.println("DVD is set!");
    }

    public void setRadio() {
        System.out.println("Radio is set!");
    }

    public void setVolume(int value) {
        System.out.println("Volume: " + value);
    }
}

