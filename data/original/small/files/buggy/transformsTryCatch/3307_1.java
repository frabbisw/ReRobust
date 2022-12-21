@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/{id}/contactInfoList")
@javax.ws.rs.Consumes(value = "application/json")
@javax.ws.rs.Produces(value = "application/json")
public void updateContactInfoList(@javax.ws.rs.PathParam(value = "id") java.lang.Integer patientId, java.util.List<model.ContactInfo> contactInfoList) {
    try {
        java.lang.System.out.println("==============================");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("update contact Info List in Patient Service says hello");
    contactInfoDao.updateContactInfoByPatientId(patientId, contactInfoList);
}
