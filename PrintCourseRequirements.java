import java.util.Iterator;

public class PrintCourseRequirements {
    static Course biology = new CourseBiology();

    public static void main(String args[]) {
        printCourseRequirements(biology);
    }

    public static void printCourseRequirements(Course course) {
        Iterator courseIterator = course.createIterator();
        printIncompleteRequirements(courseIterator);
    }

    private static void printIncompleteRequirements(Iterator iterator) {
        System.out.println("\nINCOMPLETE REQUIREMENTS\n---------------\n\n");
        while (iterator.hasNext()) {
            Course course = (Course) iterator.next();
            if (course.isIncomplete()) {
                System.out.print(course.toString());
            }
        }
    }
}