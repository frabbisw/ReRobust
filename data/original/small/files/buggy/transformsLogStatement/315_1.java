public void deleteUser(final org.jahia.services.content.rules.DeletedNodeFact node) throws javax.jcr.RepositoryException {
    System.out.println("log");
    deleteUser(node.getName(), node.getIdentifier());
}
