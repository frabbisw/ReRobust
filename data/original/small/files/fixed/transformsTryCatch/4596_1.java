@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/register/company")
@javax.ws.rs.Consumes(value = "application/json")
@javax.ws.rs.Produces(value = "application/json")
public java.lang.Boolean registerCompany(jfs.service.services.RegisterDTO register) {
    java.lang.Boolean result = false;
    try {
        result = this.service.registerUser(register.email, register.password, UserType.COMPANY);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
