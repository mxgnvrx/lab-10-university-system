import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String id;
    private String name;
    private String address;
    private Faculty faculty;
    private List<ResearchAssociate> researchers = new ArrayList<>();

    public Institute(String id, String name, String address, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.faculty = faculty;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void addResearcher(ResearchAssociate researcher) {
        if (!researchers.contains(researcher)) {
            researchers.add(researcher);
            researcher.setInstitute(this);
        }
    }

    public void removeResearcher(ResearchAssociate researcher) {
        researchers.remove(researcher);
    }

    public List<ResearchAssociate> getResearchers() {
        return researchers;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", researchers=" + researchers.size() +
                '}';
    }

    public void displayInfo() {
        System.out.println("    Institute: " + name + " (" + address + ")");
        System.out.println("    Researchers: " + researchers.size());
    }
}
