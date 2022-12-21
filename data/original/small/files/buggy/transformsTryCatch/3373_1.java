private static void doRollback(@org.jetbrains.annotations.NotNull final com.intellij.openapi.vcs.ex.LineStatusTracker tracker, @org.jetbrains.annotations.NotNull final com.intellij.openapi.vcs.ex.Range range) {
    try {
        com.intellij.openapi.vcs.ex.RollbackLineStatusAction.execute(tracker, new java.lang.Runnable() {

            @java.lang.Override
            public void run() {
                tracker.rollbackChanges(range);
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
