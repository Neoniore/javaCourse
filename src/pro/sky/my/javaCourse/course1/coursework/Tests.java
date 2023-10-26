package pro.sky.my.javaCourse.course1.coursework;

public class Tests {
    public static void main(String[] args) {
        //Хранилище для записей о сотрудниках
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Александр", "Панченко", "Витальевич", 1, 1500000);
        employees[1] = new Employee("Ника", "Прохорова", "Марковна", 2, 50000);
        employees[2] = new Employee("Иван", "Рыбаков", "Георгиевич", 1, 75000);
        employees[3] = new Employee("Владимир", "Алексеев", "Александрович", 5, 80000);
        employees[4] = new Employee("Александр", "Снегирев", "Иванович", 5, 90000);
        employees[5] = new Employee("Кристина", "Кузьмина", "Михайловна", 4, 65000);
        employees[6] = new Employee("Дмитрий", "Ушаков", "Тимофеевич", 4, 130000);
        employees[7] = new Employee("Илья", "Бочаров", "Арсентьевич", 3, 150000);
        employees[8] = new Employee("Елисей", "Иванов", "Львович", 3, 145000);
        employees[9] = new Employee("Андрей", "Петровский", "Степанович", 2, 250000);

        showAllEmployees(employees);
        System.out.printf("------\nСумма затрат на зарплаты в месяц\n------\n%.2fр\n\n\n", calculateTheAmountOfSalaryCosts(employees));
        System.out.printf("------\nCотрудник с минимальной зарплатой\n------\n%s\n\n\n", searchingEmployeeWithMinSalary(employees));
        System.out.printf("------\nCотрудник с максимальной зарплатой\n------\n%s\n\n\n", searchingEmployeeWithMaxSalary(employees));
        System.out.printf("------\nСреднее значение зарплат\n------\n%s\n\n\n",calculateAverageSalary(employees));
        outputFullNamesOfEmployees(employees);
        indexingSalary(employees, 9.5);
        showAllEmployees(employees); //тест индексации
        int department = 5;
        System.out.printf("------\nCотрудник с минимальной зарплатой в отделе %d\n------\n%s\n\n\n", department, searchingEmployeeInDepartmentWithMinSalary(employees, department));
        System.out.printf("------\nCотрудник с максимальной зарплатой в отделе %d\n------\n%s\n\n\n", department, searchingEmployeeInDepartmentWithMaxSalary(employees, department));
        System.out.printf("------\nСреднее значение зарплат в отделе %d\n------\n%s\n\n\n", department, calculateAverageSalaryInDepartment(employees, department));



    }

    //Метод вывода информации о всех сотрудниках
    public static void showAllEmployees(Employee[] employees) {
        System.out.println("------\nВсе сотрудники\n------");
        for (Employee employee : employees) {
            System.out.println(employee + "\n");
        }
        System.out.println();
    }

    //Метод рассчета суммы затрат на зарплаты в месяц
    public static double calculateTheAmountOfSalaryCosts(Employee[] employees) {
        double ammount = 0;
        for (Employee employee : employees) {
            ammount += employee.getSalary();
        }
        return ammount;
    }

    //Метод поиска сотрудника с минимальной зарплатой
    public static Employee searchingEmployeeWithMinSalary(Employee[] employees) {
        double minSalary = 10_000_000_000d;
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    //Метод поиска сотрудника с максимальной зарплатой
    public static Employee searchingEmployeeWithMaxSalary(Employee[] employees) {
        double maxSalary= -1d;
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    //Метод подсчета среднего значения зарплат
    public static double calculateAverageSalary(Employee[] employees) {
        return calculateTheAmountOfSalaryCosts(employees) / employees.length;
    }

    //Метод вывода ФИО всех сотрудников
    public static void outputFullNamesOfEmployees(Employee[] employees) {
        System.out.println("------\nФИО всех сотрудников\n------");
        for (Employee employee : employees) {
            System.out.printf("%s %s %s \n", employee.getName(), employee.getSurname(), employee.getPatronymic());
        }
    }

    //Метод индексации заработной платы всем сотрудникам
    public static void indexingSalary(Employee[] employees, double percent) {
        if (percent <= 0) {
            throw new IllegalArgumentException("Процент повышения не может равняться нулю или быть меньше нуля");
        }
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * percent / 100 + employee.getSalary());
        }
    }

    //Метод поиска сотурудника с нимимальной зарплатой в отделе
    public static Employee searchingEmployeeInDepartmentWithMinSalary(Employee[] employees, int department) {
        Employee.validationDepartmentInput(department);
        double minSalary = 10_000_000_000d;
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    employeeWithMinSalary = employee;
                }
            }
        }
        if (employeeWithMinSalary == null) {
            System.out.printf("В %d отделе нет сотрудников\n", department);
        }
        return employeeWithMinSalary;
    }

    //Метод поиска сотурудника с максимальной зарплатой в отделе
    public static Employee searchingEmployeeInDepartmentWithMaxSalary(Employee[] employees, int department) {
        Employee.validationDepartmentInput(department);
        double maxSalary = -1;
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    employeeWithMinSalary = employee;
                }
            }
        }
        if (employeeWithMinSalary == null) {
            System.out.printf("В %d отделе нет сотрудников\n", department);
        }
        return employeeWithMinSalary;
    }

    //Метод поиска средней зарплаты по отделу
    public static double calculateAverageSalaryInDepartment(Employee[] employees, int department) {
        Employee.validationDepartmentInput(department);
        double avgSalaryInDepartment, ammount = 0;
        int employeesInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employeesInDepartment++;
                ammount += employee.getSalary();
            }
        }
        avgSalaryInDepartment = ammount / employeesInDepartment;
        return avgSalaryInDepartment;
    }



}
