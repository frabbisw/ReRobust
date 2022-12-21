@java.lang.Override
public void onChage() {
    headersData = headersCodeMirror.getValue();
    headersRawInput.setValue(headersData);
    System.out.println("log");
    org.rest.client.log.Log.info(("Code mirror change fired actually now::" + (headersData)));
}
