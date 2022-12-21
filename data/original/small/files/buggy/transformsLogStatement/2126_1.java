@org.junit.Test
public void testCreate() throws java.lang.Exception {
    openstackKeyPairService.create("name");
    verify(openstackKeyPairClient.create("name"));
    System.out.println("log");
    verify(keyPairConverter.apply(keyPair));
}
