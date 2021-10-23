package command;

public interface Environment {
}

class GarageDoor implements Environment {

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

class Light implements Environment {
    String location;

    public Light(String place) {
        this.location = place;
    }


    public void on() {
        System.out.println("Light is ON in " + location);
    }

    public void off() {
        System.out.println("Light is OFF in " + location);
    }
}

class Stereo implements Environment {
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

class CellingFan implements Environment {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    private int speed;

    public CellingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void setHighSpeed() {
        speed = HIGH;
    }

    public void setMediumSpeed() {
        speed = MEDIUM;
    }

    public void setLowSpeed() {
        speed = LOW;
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}