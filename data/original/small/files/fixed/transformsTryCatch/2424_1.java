@java.lang.Override
public void run() {
    try {
        if (((parentStatement) != null) && (!(parentStatement.didRun()))) {
            returnType = script.getLogic().run(line, this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
