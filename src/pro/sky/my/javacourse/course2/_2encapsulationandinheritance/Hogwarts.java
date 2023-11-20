package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

public class Hogwarts {

    private final String name;
    private int powerOfMagic;
    private int transgressionDistance;

    /**
     *
     * @param name - фио студента
     * @param powerOfMagic - сила магии
     * @param transgressionDistance - дальность трансгрессирования
     */
    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return  "name " + name + ' ' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance;
    }
}
