public void fullScreen(java.lang.String renderer) {
    try {
        if (insideSettings("fullScreen", renderer)) {
            fullScreen = true;
            this.renderer = renderer;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
