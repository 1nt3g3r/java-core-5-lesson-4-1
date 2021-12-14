package cars.carimp;

import cars.Car;

public class Porsche extends Car {
    @Override
    public String getModel() {
        return "Porsche 911";
    }

    @Override
    public void drive() {
        System.out.println("Driving Porsche");
    }
}
