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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
