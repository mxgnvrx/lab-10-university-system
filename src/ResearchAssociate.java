import java.util.HashMap;
import java.util.Map;

public class ResearchAssociate extends Employee {
    private String area;
    private Map<Project, Integer> projects = new HashMap<>();
    private Institute institute;

    public ResearchAssociate(String id, String name, String email, String ssn, String area) {
        super(id, name, email, ssn);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public void addProject(Project project, int hours) {
        projects.put(project, hours);
        project.addResearcher(this, hours);
    }

    public void removeProject(Project project) {
        projects.remove(project);
        project.removeResearcher(this);
    }

    public Map<Project, Integer> getProjects() {
        return projects;
    }

    public int getProjectHours(Project project) {
        return projects.getOrDefault(project, 0);
    }

    @Override
    public String toString() {
        return "ResearchAssociate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", area='" + area + '\'' +
                ", projects=" + projects.size() +
                '}';
    }
}
