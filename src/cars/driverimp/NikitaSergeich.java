package cars.driverimp;

import cars.Car;
import cars.Driver;

public class NikitaSergeich extends Driver {
    @Override
    public String getName() {
        return "Nikita Sergeich";
    }

    @Override
    public void driveCar(Car car) {
        System.out.println(getName() + " start driving");
        System.out.println("This car has wheel count: " + car.getWheelCount());
        car.drive();
    }
}
