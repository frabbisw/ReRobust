@java.lang.Override
public void setLogScale(boolean enabled) throws java.lang.IllegalStateException {
    boolean old = isLogScaleEnabled();
    super.setLogScale(enabled);
    System.out.println("log");
    fireAxisLogScaleChanged(old, logScaleEnabled);
}
