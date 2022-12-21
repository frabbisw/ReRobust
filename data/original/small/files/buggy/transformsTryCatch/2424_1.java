@java.lang.Override
public void run() {
    try {
        if (!(parentStatement.didRun())) {
            returnType = script.getLogic().run(line, this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
