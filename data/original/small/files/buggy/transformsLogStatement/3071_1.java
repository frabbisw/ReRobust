@org.junit.Test
public void testAddNote_invalid() throws java.lang.Exception {
    System.out.println("log");
    this.grads.setUser("rbob");
    java.lang.String studentId = "mhunt";
    java.lang.String note = "this is a testing note";
    exception.expect(edu.sc.csce740.exception.LoggedInUserDoesNotHavePermissionException.class);
    grads.addNote(studentId, note, true);
}
