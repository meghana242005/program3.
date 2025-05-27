public class Employee extends Person {
    int empId;
    double salary;

    public Employee(String name, int empId, double salary) {
        super(name);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Meghana", 102, 55000.0);
        emp.displayEmployeeDetails();
        emp.displayAge("2003-05-10");
    }
}
