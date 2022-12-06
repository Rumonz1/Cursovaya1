import java.util.Objects;

public class Employee {
    private final String firstName;
    private  final String lastName;
    private final String patronymic;
    private int department;
    private double salary;
   private final  int id;
   private static int counter = 1;



    public Employee (String employeeLastName, String employeeFirstName, String employeePatronymic, int employeeDepartment, double employeeSalary){
        this.firstName = employeeFirstName;
        this.lastName = employeeLastName;
        this.patronymic = employeePatronymic;
        this.department = employeeDepartment;
        this.salary = employeeSalary;
        id = counter;
        counter+= 1;
    }
    public String getEmployeeFirstName(){
        return firstName;
    }
    public String getEmployeeLastName() {
        return lastName;
    }

    public String getEmployeePatronymic() {

        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public void setEmployeeDepartment(int department) {

        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeSalary(double salary) {

        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ФИО: "+firstName+" "+lastName+" "+patronymic+". ID: "+id+". Отдел: "+department+". З/п "+salary+"RUB.";

    }
    public boolean equals(Object other) {
        if (this.getClass() == other.getClass()) return true;
        if (other.getClass() == null || getClass() != other.getClass()) return false;
        Employee employee = (Employee) other;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(patronymic, employee.patronymic)
                && Objects.equals(department, employee.department) && Objects.equals(salary, employee.salary) && Objects.equals(id, employee.id);
    }
    public int hashCode() {
        return Objects.hash(firstName, lastName,patronymic,department,salary,id);
    }
}
