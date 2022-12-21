@org.junit.After
public void tearDown() throws java.io.IOException {
    realm.dispose();
    try {
        stream.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
