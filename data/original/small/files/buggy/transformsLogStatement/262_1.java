@java.lang.Override
public void sendStickyBroadcast(final android.content.Intent intent) {
    System.out.println("log");
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {

        @java.lang.Override
        public void run(final android.content.Intent intent) {
            com.oasisfeng.condom.CondomContext.super.sendStickyBroadcast(intent);
        }
    });
}
