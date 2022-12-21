@java.lang.Override
public void run() {
    if ((Controller.getList().indexOf(obj)) == (-1)) {
        executorService.shutdown();
    }
    try {
        testIt(obj.getUrl());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
