@java.lang.Override
public void setLogScale(boolean enabled) throws java.lang.IllegalStateException {
    boolean old = isLogScaleEnabled();
    super.setLogScale(enabled);
    try {
        fireAxisLogScaleChanged(old, logScaleEnabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
