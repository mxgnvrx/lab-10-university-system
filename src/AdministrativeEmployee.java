public class AdministrativeEmployee extends Employee {
    private String department;

    public AdministrativeEmployee(String id, String name, String email, String ssn, String department) {
        super(id, name, email, ssn);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "AdministrativeEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
