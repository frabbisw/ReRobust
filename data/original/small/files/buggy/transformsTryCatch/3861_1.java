public javafx.scene.image.Image getImage() {
    try {
        if (this.animated) {
            this.animation.getCurrentFrame();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.image;
}
