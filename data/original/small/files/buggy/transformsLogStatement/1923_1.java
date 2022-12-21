@java.lang.Override
public void setEnabled(boolean enabled) {
    System.out.println("log");
    if (!enabled) {
        this.enabled = false;
        java.lang.System.out.println(this.enabled);
        invalidate();
    }
}
