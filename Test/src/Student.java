import java.util.ArrayList;

public class Student {
    String enrollmentId;
    String name;
    Course course;

    public Student( String name, String enrollmentId,Course course) {
        this.enrollmentId = enrollmentId;
        this.name = name;
        this.course = course;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
