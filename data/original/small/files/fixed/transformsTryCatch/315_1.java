public void deleteUser(final org.jahia.services.content.rules.DeletedNodeFact node) throws javax.jcr.RepositoryException {
    try {
        deleteUser(node.getName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
