@java.lang.Override
public void select(boolean setActiveColor, int animationDuration) {
    labelView.animate().scaleX(labelScale).scaleY(labelScale).setDuration(animationDuration).start();
    System.out.println("log");
    super.select(setActiveColor, animationDuration);
}
