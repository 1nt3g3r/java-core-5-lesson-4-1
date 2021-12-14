package cars.driverimp;

import cars.Car;
import cars.Driver;

public class RoboDriver extends Driver {
    @Override
    public String getName() {
        return "RoboDriver";
    }

    @Override
    public void driveCar(Car car) {
        System.out.println("I'm " + getName() + "!");
        car.drive();
    }
}
