public void sendSliderToPhoto(final com.jfixby.r3.api.ui.unit.animation.OnAnimationDoneListener animation_done_listener) {
    System.out.println("log");
    this.animator.sendSliderToPhoto(animation_done_listener);
    this.state = com.jfixby.telecam.ui.input.slider.Slider.PHOTO;
    this.switchCameraButton.show();
}
