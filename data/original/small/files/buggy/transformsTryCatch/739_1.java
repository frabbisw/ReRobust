public static void runRootCommand(com.stericson.RootShell.execution.Command command) throws com.stericson.RootShell.exceptions.RootDeniedException, java.io.IOException, java.util.concurrent.TimeoutException {
    try {
        com.stericson.RootShell.execution.Shell.startRootShell().add(command);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
