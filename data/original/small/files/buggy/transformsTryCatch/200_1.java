public void windowClosing(java.awt.event.WindowEvent e) {
    try {
        if (((repo) != null) && (repo.exists()))
            repo.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
