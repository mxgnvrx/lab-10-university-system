import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Project {
    private String id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private String area;
    private Map<ResearchAssociate, Integer> researchers = new HashMap<>();

    public Project(String id, String name, String description, Date startDate, Date endDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void addResearcher(ResearchAssociate researcher, int hours) {
        if (!researchers.containsKey(researcher)) {
            researchers.put(researcher, hours);
        }
    }

    public void removeResearcher(ResearchAssociate researcher) {
        researchers.remove(researcher);
    }

    public Map<ResearchAssociate, Integer> getResearchers() {
        return researchers;
    }

    public int getResearcherHours(ResearchAssociate researcher) {
        return researchers.getOrDefault(researcher, 0);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", researchers=" + researchers.size() +
                '}';
    }

    public void displayInfo() {
        System.out.println("    Project: " + name + " (ID: " + id + ")");
        System.out.println("      Area: " + area);
        System.out.println("      Description: " + description);
        System.out.println("      Researchers: " + researchers.size());
        for (Map.Entry<ResearchAssociate, Integer> entry : researchers.entrySet()) {
            System.out.println("        - " + entry.getKey().getName() + ": " + entry.getValue() + " hours");
        }
    }
}
