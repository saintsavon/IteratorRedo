class CourseTest {
    String courseName = "Jaylen's Courses";
    String courseDescription = "This is what my course consists of.";
    boolean courseCompleted = false;

    Course course = new Course(
        courseName,
        courseDescription,
        false
    );

    @Test
    void testConstructor() {
		assertEquals(courseName, course.getName());
		assertEquals(courseDescription, course.getDescription());
		assertFalse(course.isCompleted());
		
		String expectedString = "\n\n  [ ] " + courseName + "\n      " + courseDescription;
		assertEquals(expectedString, course.toString());
	}
}