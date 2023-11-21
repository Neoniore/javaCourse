package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

// Пуффендуй

public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    /**
     *
     * @param industriousness - трудолюбие
     * @param loyalty - верность
     * @param honesty - честность
     */
    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Hufflepuff student) {
        if (this.industriousness + this.loyalty + this.honesty > student.industriousness + student.loyalty + student.honesty) {
            System.out.printf("%s лучший Пуффендуец, чем %s\n", this.getName(), student.getName());
        } else if (this.industriousness + this.loyalty + this.honesty < student.industriousness + student.loyalty + student.honesty) {
            System.out.printf("%s лучший Пуффендуец, чем %s\n", student.getName(), this.getName());
        } else {
            System.out.printf("Пуффендуйцы %s и %s обладают равной силой\n", this.getName(), student.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}
