package pro.sky.my.javaCourse.course1.coursework;

public class Tests {
    public static void main(String[] args) {
        //Хранилище для записей о сотрудниках
        Employee[] staff = new Employee[10];

        staff[0] = new Employee("Александр", "Панченко", "Витальевич", 5, 1500000);
        staff[1] = new Employee("Ника", "Прохорова", "Марковна", 5, 50000);
        staff[2] = new Employee("Иван", "Рыбаков", "Георгиевич", 5, 75000);
        staff[3] = new Employee("Владимир", "Алексеев", "Александрович", 5, 80000);
        staff[4] = new Employee("Александр", "Снегирев", "Иванович", 5, 90000);
        staff[5] = new Employee("Кристина", "Кузьмина", "Михайловна", 5, 65000);
        staff[6] = new Employee("Дмитрий", "Ушаков", "Тимофеевич", 5, 130000);
        staff[7] = new Employee("Илья", "Бочаров", "Арсентьевич", 5, 150000);
        staff[8] = new Employee("Елисей", "Иванов", "Львович", 5, 145000);
        staff[9] = new Employee("Андрей", "Петровский", "Степанович", 5, 250000);

        showAllEmployees(staff);
        System.out.printf("------\nСумма затрат на зарплаты в месяц\n------\n%.2fр\n\n\n", calculateTheAmountOfSalaryCosts(staff));
        System.out.printf("------\nCотрудник с минимальной зарплатой\n------\n%s\n\n\n", searchingEmployeeWithMinSalary(staff));
        System.out.printf("------\nCотрудник с максимальной зарплатой\n------\n%s\n\n\n", searchingEmployeeWithMaxSalary(staff));
    }

    //Метод вывода информации о всех сотрудниках
    public static void showAllEmployees(Employee[] staff) {
        System.out.println("------\nВсе сотрудники\n------");
        for (Employee employee : staff) {
            System.out.println(employee + "\n");
        }
        System.out.println();
    }

    //Метод рассчета и вывода суммы затрат на зарплаты в месяц
    public static double calculateTheAmountOfSalaryCosts(Employee[] staff) {
        double ammount = 0;
        for (Employee employee : staff) {
            ammount += employee.getWage();
        }
        return ammount;
    }

    //Метод поиска сотрудника с минимальной зарплатой
    public static Employee searchingEmployeeWithMinSalary(Employee[] staff) {
        double minWage= 10_000_000_000d;
        Employee employeeWithMinSalary = staff[0];
        for (Employee employee : staff) {
            if (employee.getWage() < minWage) {
                minWage = employee.getWage();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    //Метод поиска сотрудника с максимальной зарплатой
    public static Employee searchingEmployeeWithMaxSalary(Employee[] staff) {
        double maxWage= -1d;
        Employee employeeWithMaxSalary = staff[0];
        for (Employee employee : staff) {
            if (employee.getWage() > maxWage) {
                maxWage = employee.getWage();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

}
