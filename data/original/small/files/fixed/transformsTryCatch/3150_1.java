public void sendSliderToPhoto(final com.jfixby.r3.api.ui.unit.animation.OnAnimationDoneListener animation_done_listener) {
    try {
        this.animator.sendSliderToPhoto(animation_done_listener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.state = com.jfixby.telecam.ui.input.slider.Slider.PHOTO;
}
