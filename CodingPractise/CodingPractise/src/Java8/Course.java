package Java8;

public class Course {
    private String name;
    private int students;
    private int reviews;

    public Course(String name, int students, int reviews) {
        this.name = name;
        this.students = students;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", reviews=" + reviews +
                '}';
    }
}
