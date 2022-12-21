@java.lang.Override
public void stop() {
    try {
        super.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.github.ybq.android.spinkit.animation.AnimationUtils.stop(sprites);
    com.github.ybq.android.spinkit.animation.AnimationUtils.stop(getAnimation());
}
