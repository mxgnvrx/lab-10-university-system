import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchAssociate {
    private String specialization;
    private List<Course> courses = new ArrayList<>();

    public Lecturer(String id, String name, String email, String ssn, String area, String specialization) {
        super(id, name, email, ssn, area);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addLecturer(this);
        }
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeLecturer(this);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void teachCourse(Course course) {
        if (!courses.contains(course)) {
            addCourse(course);
        }
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", specialization='" + specialization + '\'' +
                ", courses=" + courses.size() +
                '}';
    }
}
