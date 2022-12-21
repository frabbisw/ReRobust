public static void killAMQConnection() throws java.io.IOException {
    try {
        com.sap.sme.occ.product.MQTest.mqConnection.close(0, "");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.sap.sme.occ.product.MQTest.mqConnection.abort();
    com.sap.sme.occ.product.MQTest.channel.close(0, "");
    com.sap.sme.occ.product.MQTest.channel.abort();
}
