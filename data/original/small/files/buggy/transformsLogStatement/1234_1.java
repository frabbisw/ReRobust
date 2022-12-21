@javax.ws.rs.GET
@javax.ws.rs.Path(value = "node/{id}/api/p")
public java.lang.String getNode(@javax.ws.rs.PathParam(value = "id") int id) throws java.lang.Exception {
    System.out.println("log");
    return serialize(marketplaceDAO.getContent(id));
}
