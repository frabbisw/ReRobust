public void windowClosing(java.awt.event.WindowEvent e) {
    if (((repo) != null) && (repo.exists()))
        repo.close();
    try {
        java.lang.System.exit(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
