package pro.sky.my.javaCourse.course1.coursework;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private double salary;

    //счетчик
    private static int counter;

    //конструктор
    public Employee(String name, String surname, String patronymic, int department, double salary) {
        validationDepartmentInput(department);
        validationSalaryInput(salary);

        counter++;

        id = counter;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    //геттеры для всех полей класса
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

    public double getSalary() {
        return salary;
    }

    //методы для валидации ввода
    private void validationDepartmentInput(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номера департаментов могут быть от 1 до 5");
        }
    }

    private void validationSalaryInput(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть меньше нуля");
        }
    }

    //сеттеры департамента и зарплаты
    public void setDepartment(int department) {
        validationDepartmentInput(department);
        this.department = department;
    }

    public void setSalary(double salary) {
        validationSalaryInput(salary);
        this.salary = salary;
    }

    //переопределение методов
    @Override
    public String toString() {
        return "ФИО: " + name + " " + " " + patronymic + " " + " " + surname + "\n" + "Отдел " + department + "\nЗарплата " + salary + "\nid " + id;
    }
}
