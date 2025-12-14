public class Employee {
    protected String id;
    protected String name;
    protected String email;
    protected String ssn;

    public Employee(String id, String name, String email, String ssn) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.ssn = ssn;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
