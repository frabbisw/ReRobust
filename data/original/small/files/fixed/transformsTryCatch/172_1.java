public com.ait.lienzo.client.core.shape.wires.WiresShape addChild(final com.ait.lienzo.client.core.shape.IPrimitive<?> child, final com.ait.lienzo.client.core.shape.wires.LayoutContainer.Layout layout) {
    try {
        m_layout_container.add(child, layout);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
