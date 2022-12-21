@java.lang.Override
public void processSuccess(int responseCode, java.io.InputStream responseData) {
    try {
        java.lang.System.out.println("response received");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    processResponseIntoAppsList(responseData);
    repeatRequestOrShowResults();
}
