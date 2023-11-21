package pro.sky.my.javacourse.course2.lesson_2.encapsulation_inheritance;

// Когтевран

public class Ravenclaw extends Hogwarts {

    private final int mind;
    private final int wisdom;
    private final int creativity;

    /**
     *
     * @param mind - ум
     * @param wisdom - мудрость
     * @param creativity - творчество
     */

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public void compareStudents(Ravenclaw student) {
        if (this.mind + this.wisdom + this.creativity > student.mind + student.wisdom + student.creativity) {
            System.out.printf("%s лучший Когтевранец, чем %s\n", this.getName(), student.getName());
        } else if (this.mind + this.wisdom + this.creativity < student.mind + student.wisdom + student.creativity) {
            System.out.printf("%s лучший Когтевранец, чем %s\n", student.getName(), this.getName());
        } else {
            System.out.printf("Когтевранцы %s и %s обладают равной силой\n", this.getName(), student.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity;
    }
}
