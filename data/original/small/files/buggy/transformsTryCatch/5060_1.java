public void nextMainImage() {
    try {
        if ((this.neighborGenerator) == null) {
            this.initGenerator();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (this.mainImageID)++;
    this.neighborGenerator.setMainImage(this.mainImageID);
}
