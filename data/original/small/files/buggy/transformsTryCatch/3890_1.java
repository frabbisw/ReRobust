@java.lang.Override
public void onSuccess(org.json.simple.JSONObject result) {
    eu.h2020.symbiote.CoreResourceAccessMonitorApplicationTests.log.info(("Successully received resource urls: " + result));
    try {
        resultRef.set(result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
