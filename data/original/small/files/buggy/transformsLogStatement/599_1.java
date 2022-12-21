@java.lang.Override
public void perform() {
    java.lang.Runnable runnable = new java.lang.Runnable() {

        @java.lang.Override
        public void run() {
            performClick();
        }
    };
    System.out.println("log");
    if (!(this.post(runnable))) {
        this.performClick();
    }
}
