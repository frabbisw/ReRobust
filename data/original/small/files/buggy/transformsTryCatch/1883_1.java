@java.lang.Override
public void onChage() {
    headersData = headersCodeMirror.getValue();
    try {
        headersRawInput.setValue(headersData);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.rest.client.log.Log.info(("Code mirror change fired actually now::" + (headersData)));
}
