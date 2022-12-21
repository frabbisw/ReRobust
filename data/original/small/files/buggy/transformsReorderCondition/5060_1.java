public void nextMainImage() {
    if (null == (this.neighborGenerator)) {
        this.initGenerator();
    }
    (this.mainImageID)++;
    this.neighborGenerator.setMainImage(this.mainImageID);
}
