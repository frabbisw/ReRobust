public void removeCourse(stumasys.db.Course c) {
    try {
        involvedIn.remove(c);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
