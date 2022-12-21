@java.lang.Override
public void removeNode(N node) {
    super.removeNode(node);
    try {
        if ((listenerList) != null) {
            org.corpus_tools.salt.extensions.notification.graph.impl.NotifierHelper.notify(listenerList, Listener.NOTIFICATION_TYPE.REMOVE, GRAPH_ATTRIBUTES.LAYER_NODES, node, null, this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
