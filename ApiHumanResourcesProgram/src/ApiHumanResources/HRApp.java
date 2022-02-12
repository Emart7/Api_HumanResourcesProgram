package ApiHumanResources;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("HRApp Stars");

        Employee employee1 = new Employee(230, "Jerry", 50000);
        Employee employee2 = new Employee(200, "Henry", 45000);

        Department dept = new Department("Education");
        dept.addEmp(employee1);
        dept.addEmp(employee2);
        dept.addEmp(new Employee(772, "Jack", 2998));

        Employee[] emps = dept.getEmployees();

        for (Employee emp : emps) {
            System.out.println("Employee " + emp);
        }
            System.out.println("Total " + dept.getTotalSalary());
            System.out.println("Avg " + dept.getAverageSalary());
            System.out.println("Emp " + dept.getEmployeeByID(420));
            

    }

}
