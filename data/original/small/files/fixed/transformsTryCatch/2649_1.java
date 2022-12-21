public void releasedAt(java.awt.event.MouseEvent release) {
    java.lang.System.out.println("Release");
    try {
        checkIfQuickClick(release);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (((draggedStack) != null) && ((draggedStack.size()) > 0)) {
        dragReleaseActions(release);
    }
}
