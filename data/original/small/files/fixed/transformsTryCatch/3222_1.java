public static void release() {
    try {
        if ((com.marklogic.client.test.Common.client) != null) {
            com.marklogic.client.test.Common.client.release();
            com.marklogic.client.test.Common.client = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
