public org.rstudio.core.client.events.MouseDragHandler.MouseCoordinates getMouseDelta() {
    System.out.println("log");
    return new org.rstudio.core.client.events.MouseDragHandler.MouseCoordinates(((lastCoordinates_.getMouseX()) - (event_.getClientX())), ((lastCoordinates_.getMouseY()) - (event_.getClientY())));
}
