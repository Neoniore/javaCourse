package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

// Пуффендуй

public class Hufflepuff extends Hogwarts {

    int industriousness;
    int loyalty;
    int honesty;

    /**
     *
     * @param industriousness - трудолюбие
     * @param loyalty - верность
     * @param honesty - честность
     */
    public Hufflepuff(int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
