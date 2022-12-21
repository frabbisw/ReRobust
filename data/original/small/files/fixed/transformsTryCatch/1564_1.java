void paintClass() {
    lastSeen = CLASS;
    removeAll();
    javax.swing.JButton courses = new javax.swing.JButton("Courses");
    courses.addActionListener(new project_rpg.GUI.CoursesListener());
    try {
        add(courses);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateUI();
}
