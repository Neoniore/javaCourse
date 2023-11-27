package pro.sky.my.javacourse.course2.lesson_3.polymorphism_Interfaces;

public class Tests {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        VehicleOnWheels[] vehicles = {
                bicycle,
                bicycle2,
                car,
                car2,
                truck,
                truck2
        };

        for (VehicleOnWheels vehicle: vehicles) {
            vehicle.check();
            System.out.println();
        }
    }
}
