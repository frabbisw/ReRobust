@java.lang.Override
public void setEnabled(boolean enabled) {
    try {
        if (!enabled) {
            this.enabled = false;
            java.lang.System.out.println(this.enabled);
            invalidate();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
