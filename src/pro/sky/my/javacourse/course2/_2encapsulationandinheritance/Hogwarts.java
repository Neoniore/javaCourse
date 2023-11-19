package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

public class Hogwarts {
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(int powerOfMagic, int transgressionDistance) {
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
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
}
