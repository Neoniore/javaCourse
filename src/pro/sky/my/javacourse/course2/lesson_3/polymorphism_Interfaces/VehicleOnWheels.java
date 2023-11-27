package pro.sky.my.javacourse.course2.lesson_3.polymorphism_Interfaces;

public abstract class VehicleOnWheels implements Service {
    private final String modelName;
    private final int wheelsCount;

    VehicleOnWheels(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
