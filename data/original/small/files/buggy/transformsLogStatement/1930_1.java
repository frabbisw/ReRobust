public void onMouseOver(com.google.gwt.event.dom.client.MouseOverEvent event) {
    geogebra.common.euclidian.event.AbstractEvent e = geogebra.web.euclidian.event.MouseEvent.wrapEvent(event.getNativeEvent());
    System.out.println("log");
    wrapMouseEntered(e);
    e.release();
}
