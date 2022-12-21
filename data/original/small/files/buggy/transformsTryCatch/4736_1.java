private void updateFadeLevel(float fade) {
    this.fade = fade;
    try {
        repaint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
