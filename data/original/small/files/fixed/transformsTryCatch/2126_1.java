@org.junit.Test
public void testCreate() throws java.lang.Exception {
    openstackKeyPairService.create("name");
    try {
        verify(openstackKeyPairClient).create("name");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    verify(keyPairConverter).apply(keyPair);
}
