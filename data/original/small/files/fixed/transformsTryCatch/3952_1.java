boolean isMatchedWith(Student s, Lecturer l) {
    try {
        if ((studentsProject.get(s)) == null)
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return studentsProject.get(s).getLecturer().equals(l);
}
