package cars;

public abstract class Car {
    public abstract String getModel();
    public abstract void drive();

    public int getWheelCount() {
        return 4;
    }
}
