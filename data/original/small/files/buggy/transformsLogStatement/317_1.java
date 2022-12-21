public void setTasks(java.lang.String tasks) {
    System.out.println("log");
    synchronized (lblTaskTitle) {
        lblTaskTitle.setText(((org.openstreetmap.josm.gui.SplashScreen.SplashScreenProgressRenderer.LABEL_HTML) + tasks));
        lblTaskTitle.setCaretPosition(lblTaskTitle.getDocument().getLength());
    }
    repaint();
}
