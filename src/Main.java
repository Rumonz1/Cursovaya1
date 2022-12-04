public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Минина", "Елена", "Викторовна", 1 , 42000);
        employees[1] = new Employee("Очкова", "Мирона", "Олеговна", 2, 30000);
        employees[2] = new Employee("Свиридов", "Евгений", "Александрович", 2, 55000);
        employees[3] = new Employee("Воронцов", "Артём", "Михайлович", 5, 53500);
        employees[4] = new Employee("Сафронов", "Геннадий", "Тарасович", 4, 42350);
        employees[5] = new Employee("Морозова", "Екатерина", "Максимовна", 2, 51000);
        employees[6] = new Employee("Олиева", "Айгуль", "Тахтундиновна", 3, 77000);
        employees[7] = new Employee("Карбов", "Максим", "Александрович", 1, 43500);
        employees[8] = new Employee("Шукшин", "Борис", "Петрович", 1, 33500);
        employees[9] = new Employee("Абабуров", "Асхат", "Бейринбекович", 3, 61330);

        employees[2].setEmployeeSalary(88777);
        employees[5].setEmployeeDepartment(1);
        EmployeeService.printListEmployees(employees);
        EmployeeService.printSalarySum(employees);
        EmployeeService.findMinEmployeeSalary(employees);
        EmployeeService.findMaxEmployeeSalary(employees);
        EmployeeService.findAverageEmployeeSalary(employees);
        EmployeeService.allEmployeesPrintFIO(employees);

    }

}