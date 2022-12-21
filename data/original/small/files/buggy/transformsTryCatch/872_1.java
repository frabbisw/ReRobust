private void complete(final com.microsoft.thrifty.service.MethodCall call, final java.lang.Object result) {
    try {
        callbackExecutor.submit(new java.lang.Runnable() {

            @java.lang.SuppressWarnings(value = "unchecked")
            @java.lang.Override
            public void run() {
                call.callback.onSuccess(result);
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
