public javafx.scene.image.Image getImage() {
    System.out.println("log");
    if (this.animated) {
        this.animation.getCurrentFrame();
    }
    return this.image;
}
