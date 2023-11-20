package pro.sky.my.javacourse.course2._2encapsulationandinheritance;

public class TestsHw2_2 {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 84, 79, 85, 94, 81);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 82, 85, 94, 92, 91);
        Gryffindor ronaldWeasley = new Gryffindor("Рон Уизли", 67, 64, 85, 99, 65);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 76, 75, 80, 75, 87, 77, 93);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 60, 87, 69, 68, 82, 82, 63);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 42, 45, 55, 48, 52, 51, 64);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 56, 42, 71, 62, 58);
        Hufflepuff cedricDiggory = new Hufflepuff("Седерик Дигори", 61, 34, 82, 89, 85);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 65, 57, 74, 71, 75);

        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 48, 65, 72, 65, 82);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 63, 62, 75, 84, 78);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 69, 67, 74, 75, 76);

        System.out.println("harryPotter = " + harryPotter);
        System.out.println("dracoMalfoy = " + dracoMalfoy);
        System.out.println("cedricDiggory = " + cedricDiggory);
        System.out.println("choChang = " + choChang);
    }
}
