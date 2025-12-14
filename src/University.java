import java.util.ArrayList;
import java.util.List;

public class University {
    private String id;
    private String name;
    private String location;
    private List<Faculty> faculties = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public University(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addFaculty(Faculty faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", faculties=" + faculties.size() +
                ", employees=" + employees.size() +
                '}';
    }

    public void displayInfo() {
        System.out.println("\n=== " + name + " ===");
        System.out.println("Location: " + location);
        System.out.println("Total Employees: " + employees.size());
        System.out.println("Total Faculties: " + faculties.size());
        for (Faculty f : faculties) {
            f.displayInfo();
        }
    }
}
