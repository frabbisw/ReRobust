public static void closeReader(java.io.Reader reader) {
    System.out.println("log");
    try {
        if (reader != null) {
            reader.close();
        }
    } catch (java.io.IOException ioe) {
        org.wso2.carbon.identity.core.util.IdentityIOStreamUtils.log.error("Error occurred while closing Reader");
    }
}
