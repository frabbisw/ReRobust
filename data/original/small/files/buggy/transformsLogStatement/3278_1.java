@java.lang.Override
public void execute() {
    System.out.println("log");
    try {
        command.execute();
    } catch (java.lang.Exception e) {
        gwtLogger.warn(e.getMessage(), e);
    }
}
