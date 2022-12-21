public void windowClosing(java.awt.event.WindowEvent e) {
    if ((repo.exists()) && ((repo) != null))
        repo.close();
}
