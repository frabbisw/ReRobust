@org.junit.Test
public void testCreate() throws java.lang.Exception {
    openstackKeyPairService.create("name");
    verify(openstackKeyPairClient.create("name"));
    try {
        verify(keyPairConverter.apply(keyPair));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
