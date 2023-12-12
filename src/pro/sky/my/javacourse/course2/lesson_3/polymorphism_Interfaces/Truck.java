package pro.sky.my.javacourse.course2.lesson_3.polymorphism_Interfaces;

public class Truck extends Car {
    Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        System.out.println("Проверяем прицеп");
    }
}
