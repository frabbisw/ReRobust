@org.junit.Test
public void testAddNote_invalid() throws java.lang.Exception {
    this.grads.setUser("rbob");
    java.lang.String studentId = "mhunt";
    java.lang.String note = "this is a testing note";
    try {
        exception.expect(edu.sc.csce740.exception.LoggedInUserDoesNotHavePermissionException.class);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    grads.addNote(studentId, note, true);
}
