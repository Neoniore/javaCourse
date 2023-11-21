package pro.sky.my.javacourse.course2.lesson_2.encapsulation_inheritance;

public class Hogwarts {

    private final String name;
    private final int powerOfMagic;
    private final int transgressionDistance;

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

    public void compareStudents(Hogwarts student) {
        if (this.powerOfMagic + this.transgressionDistance > student.powerOfMagic + student.transgressionDistance) {
            System.out.printf("%s обладает большей силой, чем %s\n", this.getName(), student.getName());
        } else if (this.powerOfMagic + this.transgressionDistance < student.powerOfMagic + student.transgressionDistance) {
            System.out.printf("%s обладает большей силой, чем %s\n", student.getName(), this.getName());
        } else {
            System.out.printf("%s и %s обладают равной силой\n", this.getName(), student.getName());
        }
    }

    @Override
    public String toString() {
        return  "name=" + name +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance
                + ", ";
    }
}
