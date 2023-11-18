package pro.sky.my.javaCourse.course1.coursework;

public class Tests {
    public static void main(String[] args) {

        //Хранилище для записей о сотрудниках
        EmployeeBook employeeBook = new EmployeeBook(5);
        employeeBook.createEmployee("Александр", "Панченко", "Витальевич", 1, 1500000);



//            employees[0] = new Employee("Александр", "Панченко", "Витальевич", 1, 1500000);
//            employees[1] = new Employee("Ника", "Прохорова", "Марковна", 2, 50000);
//            employees[2] = new Employee("Иван", "Рыбаков", "Георгиевич", 1, 75000);
//            employees[3] = new Employee("Владимир", "Алексеев", "Александрович", 5, 80000);
//            employees[4] = new Employee("Александр", "Снегирев", "Иванович", 5, 90000);
//            employees[5] = new Employee("Кристина", "Кузьмина", "Михайловна", 4, 65000);
//            employees[6] = new Employee("Дмитрий", "Ушаков", "Тимофеевич", 4, 130000);
//            employees[7] = new Employee("Илья", "Бочаров", "Арсентьевич", 3, 150000);
//            employees[8] = new Employee("Елисей", "Иванов", "Львович", 3, 145000);
//            employees[9] = new Employee("Андрей", "Петровский", "Степанович", 2, 250000);
//
//            showAllEmployees(employees);
//            System.out.printf("------\nСумма затрат на зарплаты в месяц\n------\n%.2fр\n\n\n", employeeBook.calculateTheAmountOfSalaryCosts(employees));
//            System.out.printf("------\nCотрудник с минимальной зарплатой\n------\n%s\n\n\n", searchingEmployeeWithMinSalary(employees));
//            System.out.printf("------\nCотрудник с максимальной зарплатой\n------\n%s\n\n\n", searchingEmployeeWithMaxSalary(employees));
//            System.out.printf("------\nСреднее значение зарплат\n------\n%s\n\n\n",calculateAverageSalary(employees));
//            outputFullNamesOfEmployees(employees);
//            indexingSalary(employees, 9.5);
//            int department = 5;
//            System.out.printf("------\nCотрудник с минимальной зарплатой в отделе %d\n------\n%s\n\n\n", department, searchingEmployeeInDepartmentWithMinSalary(employees, department));
//            System.out.printf("------\nCотрудник с максимальной зарплатой в отделе %d\n------\n%s\n\n\n", department, searchingEmployeeInDepartmentWithMaxSalary(employees, department));
//            System.out.printf("------\nСреднее значение зарплат в отделе %d\n------\n%s\n\n\n", department, calculateAverageSalaryInDepartment(employees, department));
//            indexingSalaryInDepartment(employees,1, 25);
//            showAllEmployeesInDepartment(employees, department);
//            findASalaryLessThanANumber(employees, 75000);
//            findASalaryGreaterThanANumber(employees, 5000);

    }
}

