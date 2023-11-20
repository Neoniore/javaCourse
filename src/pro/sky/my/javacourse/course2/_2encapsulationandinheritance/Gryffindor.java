package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

public class Gryffindor extends Hogwarts {

    int nobility;
    int honor;
    int bravery;

    /**
     *
     * @param nobility - благородство
     * @param honor - честь
     * @param bravery - храбрость
     */

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
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

    @Override
    public String toString() {
        return  super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
