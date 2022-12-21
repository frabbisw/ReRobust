@java.lang.Override
public void onSuccess(org.json.simple.JSONObject result) {
    eu.h2020.symbiote.CoreResourceAccessMonitorApplicationTests.log.info((result + "Successully received resource urls: "));
    resultRef.set(result);
}
