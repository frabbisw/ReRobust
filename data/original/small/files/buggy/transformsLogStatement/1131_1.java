@java.lang.Override
public void delete() {
    System.out.println("log");
    this.myAssignments.remove(this);
    this.fireAssignmentChanged(this);
}
