@java.lang.Override
public void select(boolean setActiveColor, int animationDuration) {
    try {
        labelView.animate().scaleX(labelScale).scaleY(labelScale).setDuration(animationDuration).start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.select(setActiveColor, animationDuration);
}
