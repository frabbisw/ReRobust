public void delete(java.lang.String id) throws java.lang.Exception {
    System.out.println("log");
    org.elasticsearch.action.delete.DeleteResponse response = client.prepareDelete("productindex", "prindextype", id).setOperationThreaded(false).execute().actionGet();
}
