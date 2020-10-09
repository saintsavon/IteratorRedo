import java.util.Iterator;

public class PrintAllCourses {
    static CourseID biology = new CourseBiology();

    public static void main(String args[]) {
        printCourseRequirements(biology);
    }

    public static void printCourseRequirements(CourseID course) {
        Iterator courseIterator = course.createIterator();
        printCourseRequirements(courseIterator);
    }

    private static void printCourseRequirements(Iterator iterator) {
        System.out.println("\nCOURSES (BIOLOGY):");
        while (iterator.hasNext()) {
            Course course = (Course) iterator.next();
            System.out.print(course.toString());
        }
    }
}