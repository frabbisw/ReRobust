@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    try {
        handler.post(createRunnable(parent, startTime, startScale, endScale));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    can_scroll = false;
}
