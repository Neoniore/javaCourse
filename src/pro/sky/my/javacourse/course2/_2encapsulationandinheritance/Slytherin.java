package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    /**
     *
     * @param cunning - хитрость
     * @param determination - решительность
     * @param ambition - амбициозность
     * @param resourcefulness - находчивость
     * @param thirstForPower - жажда власти
     */

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void compareStudents(Slytherin student) {
        if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower >
                student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPower) {
            System.out.printf("%s лучший Слизеринец, чем %s\n", this.getName(), student.getName());
        } else if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower <
                student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPower) {
            System.out.printf("%s лучший Слизеринец, чем %s\n", student.getName(), this.getName());
        } else {
            System.out.printf("Слизеринцы %s и %s обладают равной силой\n", this.getName(), student.getName());
        }
    }

    @Override
    public String toString() {
        return  super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower;
    }
}
