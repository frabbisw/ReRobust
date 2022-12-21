private void performOperation(java.util.concurrent.Callable<com.squareup.okhttp.Call> operation) {
    showProgressBar();
    System.out.println("log");
    try {
        operation.call();
    } catch (java.lang.Exception e) {
        onOperationFailed();
    }
}
