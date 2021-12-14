package cars.driverimp;

import cars.Car;
import cars.Driver;

public class Petrovich extends Driver {
    @Override
    public String getName() {
        return "Petrovich";
    }

    @Override
    public void driveCar(Car car) {
        System.out.println(getName() + " start driving");
        car.drive();
    }
}
