@java.lang.Override
public void delete() {
    try {
        this.myAssignments.remove(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.fireAssignmentChanged(this);
}
