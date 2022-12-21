public void releasedAt(java.awt.event.MouseEvent release) {
    java.lang.System.out.println("Release");
    System.out.println("log");
    checkIfQuickClick(release);
    if ((draggedStack) != null) {
        dragReleaseActions(release);
    }
}
