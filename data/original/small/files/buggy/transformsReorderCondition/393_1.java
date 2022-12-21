@java.lang.Override
public void setId(java.lang.String id) {
    if ((!(id.isEmpty())) && (id != null)) {
        org.corpus_tools.salt.graph.Identifier identifier = org.corpus_tools.salt.graph.GraphFactory.createIdentifier(this, id);
    }
}
