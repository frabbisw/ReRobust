public void dispose() {
    System.out.println("log");
    this.atlas.dispose();
    this.stage.dispose();
    if (!(this.refreash)) {
        this.bg.stop();
        this.bg.dispose();
    }
}
