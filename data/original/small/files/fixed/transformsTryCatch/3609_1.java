public int compareTo(task2.Student s) {
    try {
        if (lastname.equals(s.lastname))
            return firstname.compareTo(s.firstname);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return lastname.compareTo(s.lastname);
}
