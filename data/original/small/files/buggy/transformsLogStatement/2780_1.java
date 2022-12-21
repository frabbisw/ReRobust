public static void killAMQConnection() throws java.io.IOException {
    System.out.println("log");
    com.sap.sme.occ.product.MQTest.mqConnection.close(0, "");
    com.sap.sme.occ.product.MQTest.mqConnection.abort();
    com.sap.sme.occ.product.MQTest.channel.close(0, "");
    com.sap.sme.occ.product.MQTest.channel.abort();
}
