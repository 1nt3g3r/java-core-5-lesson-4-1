package cars.carimp;

import cars.Car;

public class Toyota extends Car {
    @Override
    public String getModel() {
        return "Toyota Corolla";
    }

    @Override
    public void drive() {
        System.out.println("Driving Toyota");
    }
}
