import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String id;
    private String name;
    private University university;
    private Employee dean;
    private List<Institute> institutes = new ArrayList<>();

    public Faculty(String id, String name, University university) {
        this.id = id;
        this.name = name;
        this.university = university;
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Employee getDean() {
        return dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public void addInstitute(Institute institute) {
        if (!institutes.contains(institute)) {
            institutes.add(institute);
        }
    }

    public void removeInstitute(Institute institute) {
        institutes.remove(institute);
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dean=" + (dean != null ? dean.getName() : "Not assigned") +
                ", institutes=" + institutes.size() +
                '}';
    }

    public void displayInfo() {
        System.out.println("\n  Faculty: " + name);
        System.out.println("  Dean: " + (dean != null ? dean.getName() : "Not assigned"));
        System.out.println("  Institutes: " + institutes.size());
        for (Institute i : institutes) {
            i.displayInfo();
        }
    }
}
