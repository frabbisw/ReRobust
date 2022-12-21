@java.lang.Override
public void select(boolean setActiveColor, int animationDuration) {
    try {
        labelView.animate().scaleX(1).scaleY(1).setDuration(animationDuration).start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.select(setActiveColor, animationDuration);
}
