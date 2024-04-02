public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Соловьёв Эдуард Александрович", 57_000, 4);
        employees[1] = new Employee("Соловьёва Ирина Леонидовна", 63_000, 4);
        employees[2] = new Employee("Соловьёва Олеся Вячеславовна", 78_000, 3);
        employees[3] = new Employee("Сотников Иван Робертович", 90_000, 5);
        employees[4] = new Employee("Кличко Роман Алексеевич", 77_777, 6);
        employees[5] = new Employee("Горяев Дмитрий Эдуардович", 50_000, 1);
        employees[6] = new Employee("Кленова Алёна Сергеевна", 66_666, 6);
        employees[7] = new Employee("Зеленова Мария Александровна", 99_999, 3);
        employees[8] = new Employee("Богатырёва Ксения Романовна", 88_900, 2);
        employees[9] = new Employee("Иванов Михаил Степанович", 55_500, 1);

     printEmployee();
     printFullNameEmployee();
        System.out.println("Сумма ЗП: " + calculationSalary());
        System.out.println("Средняя ЗП: " + calculationAverageSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
    }

    private static Employee findEmployeeWithMaxSalary() {
           Employee employeeWithMaxSalary = null;
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
             maxSalary = employee.getSalary();
             employeeWithMaxSalary = employee;
            }
        }
           return employeeWithMaxSalary;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static double  calculationAverageSalary() {
        return (double) calculationSalary() / employees.length;
    }

    private static int  calculationSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static void printEmployee() {
        System.out.println("сотрудники");
        for (Employee employee : employees) {
            System.out.println(employee + "\n");
        }
    }

    private static void printFullNameEmployee() {
        System.out.println("ФИО сотрудников");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + "\n");
        }
    }
}