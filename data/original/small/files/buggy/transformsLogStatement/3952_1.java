boolean isMatchedWith(Student s, Lecturer l) {
    System.out.println("log");
    return studentsProject.get(s).getLecturer().equals(l);
}
