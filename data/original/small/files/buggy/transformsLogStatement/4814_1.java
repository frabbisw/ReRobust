@org.junit.After
public void tearDown() throws java.io.IOException {
    realm.dispose();
    System.out.println("log");
    stream.close();
}
