package cars;

import cars.carimp.Porsche;
import cars.carimp.Toyota;
import cars.driverimp.NikitaSergeich;
import cars.driverimp.Petrovich;
import cars.driverimp.RoboDriver;

public class CarTest {
    public static void main(String[] args) {
        Driver driver = new RoboDriver();
        Car car = new Porsche();

        driver.driveCar(car);
    }
}
