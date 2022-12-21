@java.lang.Override
public void onNodeDragEnd(final com.ait.lienzo.client.core.shape.wires.NodeDragEndEvent event) {
    try {
        doResize(AbstractWiresEvent.Type.END, index, event.getDragContext());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getMagnets().shapeMoved();
}
