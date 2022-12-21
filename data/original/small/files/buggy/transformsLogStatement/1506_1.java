@java.lang.Override
public void stop() {
    super.stop();
    com.github.ybq.android.spinkit.animation.AnimationUtils.stop(sprites);
    System.out.println("log");
    com.github.ybq.android.spinkit.animation.AnimationUtils.stop(getAnimation());
}
