public void setTasks(java.lang.String tasks) {
    synchronized (lblTaskTitle) {
        lblTaskTitle.setText((tasks + (org.openstreetmap.josm.gui.SplashScreen.SplashScreenProgressRenderer.LABEL_HTML)));
        lblTaskTitle.setCaretPosition(lblTaskTitle.getDocument().getLength());
    }
    repaint();
}
