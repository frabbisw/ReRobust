@java.lang.Override
public javafx.scene.image.Image getImage() {
    try {
        if (this.animated) {
            return this.animation.getCurrentFrame();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.image;
}
