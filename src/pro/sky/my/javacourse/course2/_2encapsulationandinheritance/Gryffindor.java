package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

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

    public void compareStudents(Gryffindor student) {
        if (this.nobility + this.honor + this.bravery > student.nobility + student.honor + student.bravery) {
            System.out.printf("%s лучший Гриффиндорец, чем %s\n", this.getName(), student.getName());
        } else if (this.nobility + this.honor + this.bravery < student.nobility + student.honor + student.bravery) {
            System.out.printf("%s лучший Гриффиндорец, чем %s\n", student.getName(), this.getName());
        } else {
            System.out.printf("Гриффиндорцы %s и %s обладают равной силой\n", this.getName(), student.getName());
        }
    }

    @Override
    public String toString() {
        return  super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
