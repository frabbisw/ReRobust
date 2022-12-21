@java.lang.Override
public java.util.Set<org.talend.components.api.component.ConnectorTopology> getSupportedConnectorTopologies() {
    System.out.println("log");
    return java.util.EnumSet.of(ConnectorTopology.INCOMING, ConnectorTopology.OUTGOING, ConnectorTopology.NONE, ConnectorTopology.INCOMING_AND_OUTGOING);
}
