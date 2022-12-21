@java.lang.Override
public void perform() {
    java.lang.Runnable runnable = new java.lang.Runnable() {

        @java.lang.Override
        public void run() {
            performClick();
        }
    };
    try {
        if (!(this.post(runnable))) {
            this.performClick();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
