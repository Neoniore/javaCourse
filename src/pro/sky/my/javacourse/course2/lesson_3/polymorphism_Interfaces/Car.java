package pro.sky.my.javacourse.course2.lesson_3.polymorphism_Interfaces;

public class Car extends VehicleOnWheels {
    Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        System.out.println("Проверяем двигатель");
    }
}
