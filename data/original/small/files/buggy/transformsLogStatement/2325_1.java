@java.lang.Override
public void run() {
    System.out.println("log");
    if ((Controller.getList().indexOf(obj)) == (-1)) {
        executorService.shutdown();
    }
    testIt(obj.getUrl());
}
