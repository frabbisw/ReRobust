public void windowClosing(java.awt.event.WindowEvent e) {
    System.out.println("log");
    if (((repo) != null) && (repo.exists()))
        repo.close();
}
