package pro.sky.my.javaCourse.course1.coursework;

public class EmployeeBook {
    private int id;
    private Employee[] employees;

    private static int counter;


    //конструктор
    public EmployeeBook(Employee[] employees) {
        counter++;

        this.id = counter;
        this.employees = employees;
    }

    //геттер

    //сеттер

    //Метод добавления работника в EmployeeBook
    public void createEmployee(int String name, String surname, String patronymic, int department, double salary) {

    }


/*
    //Метод вывода информации о всех сотрудниках
    public void showAllEmployees(Employee[] employees) {
        System.out.println("------\nВсе сотрудники\n------");
        for (Employee employee : employees) {
            System.out.println(employee + "\n");
        }
        System.out.println();
    }

    //Метод рассчета суммы затрат на зарплаты в месяц
    public double calculateTheAmountOfSalaryCosts(Employee[] employees) {
        double ammount = 0;
        for (Employee employee : employees) {
            ammount += employee.getSalary();
        }
        return ammount;
    }

    //Метод поиска сотрудника с минимальной зарплатой
    public mployee searchingEmployeeWithMinSalary(Employee[] employees) {
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
    public Employee searchingEmployeeWithMaxSalary(Employee[] employees) {
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
    public double calculateAverageSalary(Employee[] employees) {
        return calculateTheAmountOfSalaryCosts(employees) / employees.length;
    }

    //Метод вывода ФИО всех сотрудников
    public void outputFullNamesOfEmployees(Employee[] employees) {
        System.out.println("------\nФИО всех сотрудников\n------");
        for (Employee employee : employees) {
            System.out.printf("%s %s %s \n", employee.getName(), employee.getSurname(), employee.getPatronymic());
        }
    }

    //Метод индексации заработной платы всем сотрудникам
    public void indexingSalary(Employee[] employees, double percent) {
        Employee.validationSalaryIndexInput(percent);
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * percent / 100 + employee.getSalary());
        }
    }

    //Метод поиска сотурудника с нимимальной зарплатой в отделе
    public Employee searchingEmployeeInDepartmentWithMinSalary(Employee[] employees, int department) {
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
    public Employee searchingEmployeeInDepartmentWithMaxSalary(Employee[] employees, int department) {
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
    public double calculateAverageSalaryInDepartment(Employee[] employees, int department) {
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

    //Метод индексации зарплаты всех сотрудников отдела
    public void indexingSalaryInDepartment(Employee[] employees, int department, double percent) {
        Employee.validationDepartmentInput(department);
        Employee.validationSalaryIndexInput(percent);
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * percent / 100 + employee.getSalary());
            }
        }
    }

    //Метод вывода информации о сотрудниках отдела
    public void showAllEmployeesInDepartment(Employee[] employees, int department) {
        Employee.validationDepartmentInput(department);
        System.out.printf("------\nСотрудники в %d отделе\n------\n", department);
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.printf("id %s\nФИО %s %s %s\nЗА %s\n\n", employee.getId(), employee.getName(), employee.getSurname(), employee.getPatronymic(), employee.getSalary());
            }
        }
    }


    //Метод получения всех сотрудников с зарплатой меньше переданного числа
    public void findASalaryGreaterThanANumber(Employee[] employees, double number) {
        System.out.printf("------\nСотрудники c зарплатой %.2fр или больше\n------\n", number);
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > number) {
                System.out.printf("id %s\nФИО %s %s %s\nЗА %s\n\n", employee.getId(), employee.getName(), employee.getSurname(), employee.getPatronymic(), employee.getSalary());
                count ++;
            }
        }
        if (count == 0) {
            System.out.printf("Нет сотрудников c зарплатой %.2fр или больше\n", number);
        }

    }

    //Метод получения всех сотрудников с зарплатой равной переданному числу или больше него
    public void findASalaryLessThanANumber(Employee[] employees, double number) {
        System.out.printf("------\nСотрудники c зарплатой меньше %.2fр\n------\n", number);
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.printf("id %s\nФИО %s %s %s\nЗА %s\n\n", employee.getId(), employee.getName(), employee.getSurname(), employee.getPatronymic(), employee.getSalary());
                count ++;
            }
        }
        if (count == 0) {
            System.out.printf("Нет сотрудников c зарплатой меньше %.2fр\n", number);
        }
    }
*/
}