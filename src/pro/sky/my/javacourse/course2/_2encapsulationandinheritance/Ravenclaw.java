package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

// Когтевран

public class Ravenclaw extends Hogwarts {

    int mind;
    int wisdom;
    int creativity;

    /**
     *
     * @param mind - ум
     * @param wisdom - мудрость
     * @param creativity - творчество
     */

    public Ravenclaw(int powerOfMagic, int transgressionDistance, int mind, int wisdom, int creativity) {
        super(powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
