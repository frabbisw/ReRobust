@javax.ws.rs.POST
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public backend.SaveCompetences[] saveUserCompetences(backend.SaveCompetences[] saveCompetences) {
    backend.DatabaseConnector db = new backend.DatabaseConnector();
    try {
        java.lang.System.out.println(("De db connector: " + db));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(saveCompetences);
    return null;
}
