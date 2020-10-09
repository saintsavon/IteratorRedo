import java.util.Iterator;

public class PrintAllCourses {
    static Course biology = new CourseBiology();

    public static void main(String args[]) {
        printCourseRequirements(biology);
    }

    public static void printCourseRequirements(Course course) {
        Iterator courseIterator = course.createIterator();
        printCourseRequirements(courseIterator);
    }

    private static void printCourseRequirements(Iterator iterator) {
        System.out.println("\nCOURSES\n--------\nBIOLOGY");
        while (iterator.hasNext()) {
            Course course = (Course) iterator.hasNext();
            System.out.print(course.toString());
        }
    }
}