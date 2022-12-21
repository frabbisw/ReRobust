@java.lang.Override
public void onSuccess(java.util.Map<java.lang.String, java.lang.String> result) {
    eu.h2020.symbiote.CoreResourceAccessMonitorApplicationTests.log.info(("Successully received resource urls: " + result));
    try {
        resultRef.set(result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
