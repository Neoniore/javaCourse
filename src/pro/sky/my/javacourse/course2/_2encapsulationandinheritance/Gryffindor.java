package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

public class Gryffindor extends Hogwarts {

    int nobility;
    int bravery;

    /**
     *
     * @param nobility - благородство
     * @param bravery - храбрость
     */
    public Gryffindor(int powerOfMagic, int transgressionDistance, int nobility, int bravery) {
        super(powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
