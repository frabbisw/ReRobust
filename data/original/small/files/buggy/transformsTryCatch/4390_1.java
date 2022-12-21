private static void setContainer(java.lang.String oPanelName) {
    try {
        com.eduworks.gwt.client.pagebuilder.overlay.OverlayAssembler.overlayBody.getElement().setId("overlayContainer");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.eduworks.gwt.client.pagebuilder.overlay.OverlayAssembler.overlayBody.getElement().setClassName("content");
    com.eduworks.gwt.client.pagebuilder.overlay.OverlayAssembler.overlayPanelName = oPanelName;
    com.google.gwt.user.client.ui.RootPanel.get(com.eduworks.gwt.client.pagebuilder.overlay.OverlayAssembler.overlayPanelName).add(com.eduworks.gwt.client.pagebuilder.overlay.OverlayAssembler.overlayBody);
}
