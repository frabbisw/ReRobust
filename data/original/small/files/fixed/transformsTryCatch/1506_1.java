@java.lang.Override
public void stop() {
    super.stop();
    try {
        com.github.ybq.android.spinkit.animation.AnimationUtils.stop(sprites);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
