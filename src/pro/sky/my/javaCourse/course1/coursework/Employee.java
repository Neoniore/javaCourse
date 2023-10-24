package pro.sky.my.javaCourse.course1.coursework;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private double wage;

    private static int counter;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getDepartment() {
        return department;
    }
    public double getWage() {
        return wage;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номера департаментов могут быть от 1 до 5");
        }
        this.department = department;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Зарплата не может быть меньше нуля");
        }
        this.wage = wage;
    }
}
