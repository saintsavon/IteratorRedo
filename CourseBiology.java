import java.util.Iterator;

public class CourseBiology implements CourseID {
    static final int MAX_COURSES = 5;
    int numberOfCourses = 0;
    Course[] course;

    public CourseBiology() {
        courses = new Course[MAX_COURSES];

		addCourse("Course: Ecology", "3 credit hours");
		addCourse("Course: Biology", "4 credit hours");
		addCourse("Course: Chemistry", "3 credit hours");
		addCourse("Course: Virology", "3 credit hours");
		addCourse("Course: Epidemiology", "4 credit hours");
		
		completeCourse(0);
		completeCourse(1);
    }

    public void addCourse(String name, String description) {
        Course course = new Course(name, description, false);
        if (numberOfCourses >= MAX_COURSES) {
            System.err.println("Sorry, the maximum number of courses have been added.");
        } else {
            courses[numberOfCourses] = courses;
            numberOfCourses = numberOfCourses + 1;
        }
    }

    public Course[] getCourses() {
        return courses;
    }

    public Iterator createIterator() {
        return new CourseIterator(courses);
    }

    public void completeCourse(int coursePosition) {
        courses[coursePosition].markCompleted();
    }
}