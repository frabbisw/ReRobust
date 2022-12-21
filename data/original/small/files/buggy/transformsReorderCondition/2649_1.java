public void releasedAt(java.awt.event.MouseEvent release) {
    java.lang.System.out.println("Release");
    checkIfQuickClick(release);
    if (null != (draggedStack)) {
        dragReleaseActions(release);
    }
}
