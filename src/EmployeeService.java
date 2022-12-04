public class EmployeeService {
    public static void printListEmployees (Employee[] employees) {
        System.out.println("Список сотрудников : ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void findMinEmployeeSalary(Employee[] employees) {
        double minSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                minSalary = employees[i].getSalary();
            }
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата среди сотрудников : "+ minSalary);
    }

    public static void findMaxEmployeeSalary(Employee[] employees) {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата среди сотрудников : "+ maxSalary);
    }
    public static double findEmployeeSalarySum(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public static void printSalarySum(Employee[] employees) {
        System.out.println("Сумма затрат на зарплаты в месяц : "+ findEmployeeSalarySum(employees));
    }
    public static void findAverageEmployeeSalary(Employee[] employees) {
        double averageSalary;
        int elementCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                elementCount++;
            }
        }
        averageSalary = findEmployeeSalarySum(employees) / elementCount;
        System.out.println("Средняя зарплата среди сотрудников: "+averageSalary);
    }
    public static void allEmployeesPrintFIO(Employee[] employees) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ФИО сотрудников: \n");
        for (Employee employee : employees) {
            if (employee != null) {
                String s = employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeePatronymic();
                stringBuilder.append(s).append("\n");
            }
        }
        String fullName = stringBuilder.toString();
        System.out.println(fullName);
    }
}
