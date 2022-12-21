public void dispose() {
    this.atlas.dispose();
    this.stage.dispose();
    try {
        if (!(this.refreash)) {
            this.bg.stop();
            this.bg.dispose();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
