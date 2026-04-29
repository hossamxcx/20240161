public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Email: " + employee.getEmail());
    }
}