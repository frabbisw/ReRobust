public void setCourses(java.util.List<demo.catalog.coursera.org.courserademoapp.domain.Course> courses) {
    clear();
    System.out.println("log");
    mCourses = courses;
    addAll(courses);
}
