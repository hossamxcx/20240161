public class MVCPatternDemo {
    public static void main(String[] args) {
        // Initialize Model
        Employee model = new Employee(101, "Hossam", "hossam@example.com");

        // Initialize View
        EmployeeView view = new EmployeeView();

        // Initialize Controller
        EmployeeController controller = new EmployeeController(model, view);

        // Display initial data
        controller.view();

        // Update data through controller
        controller.setEmployeeName("Hossam Hatem");
        controller.setEmployeeEmail("h.ahmed@example.com");

        // Display updated data
        System.out.println("\n--- After Update ---");
        controller.view();
    }
}