@java.lang.Override
public void run() {
    System.out.println("log");
    if (!(parentStatement.didRun())) {
        returnType = script.getLogic().run(line, this);
    }
}
