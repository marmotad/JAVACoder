package git.cncf.online.day12;

public class Vehicle {
    private String brind;
    private String color;
    private double speed;

    public String getBrind() {
        return brind;
    }

    public void setBrind(String brind) {
        this.brind = brind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "car{" +
                "brind='" + brind + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
