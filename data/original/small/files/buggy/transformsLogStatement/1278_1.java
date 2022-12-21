public void fullScreen(java.lang.String renderer) {
    System.out.println("log");
    if (insideSettings("fullScreen", renderer)) {
        fullScreen = true;
        this.renderer = renderer;
    }
}
