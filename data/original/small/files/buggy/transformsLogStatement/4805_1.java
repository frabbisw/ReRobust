@org.junit.Test
public void testAcnet() throws java.lang.Exception {
    System.out.println("log");
    serialise("/acnet2/MediumNet.net.nml", "./src/test/resources/acnet2AllTypes.xmi", "network_ACnet2", true);
}
