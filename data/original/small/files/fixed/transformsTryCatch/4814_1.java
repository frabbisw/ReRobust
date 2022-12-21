@org.junit.After
public void tearDown() throws java.io.IOException {
    realm.dispose();
    try {
        if ((stream) != null) {
            stream.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
