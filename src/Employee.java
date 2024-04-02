import java.util.Objects;

public class Employee {

    private static int counter = 1;

    private final int id;
    private final String fullName;
    private int salary;
    private int department;

    public Employee(String fullName, int salary, int department) {
        this.id = counter++;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", ФИО = '" + fullName + '\'' +
                ", зп = " + salary +
                ", отдел = " + department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, salary, department);
    }
}
