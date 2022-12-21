@java.lang.Override
public void applyTraversal(org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal<org.apache.tinkerpop.gremlin.structure.Vertex, org.apache.tinkerpop.gremlin.structure.Vertex> traversal) {
    try {
        traversal.has(Schema.ConceptProperty.ID.name(), id.toString()).not(__.hasLabel(ai.grakn.util.Schema.BaseType.CASTING.name()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
