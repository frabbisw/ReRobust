public void setCourses(java.util.List<demo.catalog.coursera.org.courserademoapp.domain.Course> courses) {
    clear();
    mCourses = courses;
    try {
        addAll(courses);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
