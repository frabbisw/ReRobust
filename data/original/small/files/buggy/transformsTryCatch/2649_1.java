public void releasedAt(java.awt.event.MouseEvent release) {
    try {
        java.lang.System.out.println("Release");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    checkIfQuickClick(release);
    if ((draggedStack) != null) {
        dragReleaseActions(release);
    }
}
