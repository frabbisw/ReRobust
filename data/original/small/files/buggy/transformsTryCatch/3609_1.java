@java.lang.Override
public int compareTo(task2.Student s) {
    try {
        if (lastname.equals(s.lastname))
            return firstname.compareTo(s.firstname);
        else
            return lastname.compareTo(s.lastname);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
