@java.lang.Override
public void run() {
    if ((-1) == (Controller.getList().indexOf(obj))) {
        executorService.shutdown();
    }
    testIt(obj.getUrl());
}
