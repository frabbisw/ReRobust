public void order(java.lang.String query) throws java.lang.Exception {
    com.password.manager.core.query.Query q = new com.password.manager.core.query.Query(query);
    try {
        objects = q.run(backupList);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyDataSetChanged();
}
