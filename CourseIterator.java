import java.util.Iterator;

public class CourseIterator implements Iterator {
    Course[] courses;
    int position = 0;

    public CourseIterator(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public boolean hasNext() {
        return courses.length > position;
    }

    @Override
    public Object next() {
        return courses[position++];
    }
}