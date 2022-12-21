public void nextMainImage() {
    if ((this.neighborGenerator) == null) {
        this.initGenerator();
    }
    (this.mainImageID)++;
    System.out.println("log");
    this.neighborGenerator.setMainImage(this.mainImageID);
}
