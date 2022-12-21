@java.lang.Override
public void setEnabled(boolean enabled) {
    this.enabled = enabled;
    try {
        invalidate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
