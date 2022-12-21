@org.junit.Before
public void setUp() {
    java.util.Random rnd = new java.util.Random();
    rnd.nextBytes(com.bubelich.jBase64Test.input_t1);
    try {
        rnd.nextBytes(com.bubelich.jBase64Test.input_t2);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    rnd.nextBytes(com.bubelich.jBase64Test.input_t3);
}
