@java.lang.Override
public void setId(java.lang.String id) {
    try {
        if ((id != null) && (!(id.isEmpty()))) {
            org.corpus_tools.salt.graph.GraphFactory.createIdentifier(this, id);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
