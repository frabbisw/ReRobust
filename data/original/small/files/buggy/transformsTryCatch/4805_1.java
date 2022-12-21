@org.junit.Test
public void testAcnet() throws java.lang.Exception {
    try {
        serialise("/acnet2/MediumNet.net.nml", "./src/test/resources/acnet2AllTypes.xmi", "network_ACnet2", true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
