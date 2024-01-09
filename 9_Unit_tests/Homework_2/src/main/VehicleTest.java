package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.*;
class VehicleTest {
    @Test
    public void carBelongsVehicle(){
        Car car = new Car("LADA", "VESTA", 2023);
        Assertions.assertInstanceOf(Vehicle.class, car);
    }
    @Test
    public void wheelsQuantityCar(){
        Car car = new Car("LADA", "VESTA", 2023);
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test
    public void wheelsQuantityMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Honda", "AfricaTwin", 2023);
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }
    @Test
    public void speedCarTestDrive(){
        Car car = new Car("LADA", "VESTA", 2023);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }
    @Test
    public void speedMotorcycleTestDrive(){
        Motorcycle motorcycle = new Motorcycle("Honda", "AfricaTwin", 2023);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }
    @Test
    public void speedCarPark(){
        Car car = new Car("LADA", "VESTA", 2023);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }
    @Test
    public void speedMotorcyclePark(){
        Motorcycle motorcycle = new Motorcycle("Honda", "AfricaTwin", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}