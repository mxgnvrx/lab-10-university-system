import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private String description;
    private int credits;
    private int weeklyHours;
    private List<Lecturer> lecturers = new ArrayList<>();

    public Course(String id, String name, String description, int credits, int weeklyHours) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.weeklyHours = weeklyHours;
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public void addLecturer(Lecturer lecturer) {
        if (!lecturers.contains(lecturer)) {
            lecturers.add(lecturer);
            if (!lecturer.getCourses().contains(this)) {
                lecturer.getCourses().add(this);
            }
        }
    }

    public void removeLecturer(Lecturer lecturer) {
        if (lecturers.contains(lecturer)) {
            lecturers.remove(lecturer);
            lecturer.getCourses().remove(this);
        }
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", weeklyHours=" + weeklyHours +
                ", lecturers=" + lecturers.size() +
                '}';
    }

    public void displayInfo() {
        System.out.println("    Course: " + name + " (ID: " + id + ")");
        System.out.println("      Credits: " + credits + ", Weekly Hours: " + weeklyHours);
        System.out.println("      Description: " + description);
        System.out.println("      Lecturers: " + lecturers.size());
    }
}
