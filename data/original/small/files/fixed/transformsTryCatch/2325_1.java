@java.lang.Override
public void run() {
    if ((Controller.getList().indexOf(obj)) == (-1)) {
        executorService.shutdown();
    }
    testIt(obj.getUrl());
    try {
        java.lang.System.out.println(time);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
