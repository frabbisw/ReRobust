@java.lang.Override
public void processSuccess(int responseCode, java.io.InputStream responseData) {
    java.lang.System.out.println("response received");
    processResponseIntoAppsList(responseData);
    try {
        repeatRequestOrShowResults(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
