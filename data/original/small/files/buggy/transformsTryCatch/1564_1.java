void paintClass() {
    lastSeen = CLASS;
    try {
        removeAll();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    javax.swing.JButton courses = new javax.swing.JButton("Courses");
    courses.addActionListener(new project_rpg.GUI.CoursesListener());
    add(courses);
    java.lang.System.out.print("I'm in class!");
    updateUI();
}
