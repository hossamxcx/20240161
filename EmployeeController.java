public class EmployeeController {
    private Employee e;
    private EmployeeView ev;

    public EmployeeController(Employee employee, EmployeeView view) {
        this.e = employee;
        this.ev = view;
    }

    public void setEmployeeName(String name) { e.setName(name); }
    public void setEmployeeEmail(String email) { e.setEmail(email); }
    public void setEmployeeId(int id) { e.setId(id); }

    public String getEmployeeName() { return e.getName(); }
    public String getEmployeeEmail() { return e.getEmail(); }
    public int getEmployeeId() { return e.getId(); }

    public void view() {
        ev.printEmployeeDetails(e);
    }
}