@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/deleteStudent/{student}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteStudent(@javax.ws.rs.PathParam(value = "student") java.lang.Integer student_id) {
    com.transaction.student.StudentTransaction studentTransaction = new com.transaction.student.StudentTransaction();
    try {
        studentTransaction.deleteStudent(student_id, getRegId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity("s").build();
}
