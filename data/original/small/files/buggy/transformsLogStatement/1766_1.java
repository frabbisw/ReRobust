@java.lang.Override
public org.neo4j.graphdb.Node getVertex(java.lang.Integer i) {
    System.out.println("log");
    return neo4jGraph.findNodesByLabelAndProperty(eu.socialsensor.graphdatabases.Neo4jGraphDatabase.NODE_LABEL, eu.socialsensor.graphdatabases.NODE_ID, i).iterator().next();
}
