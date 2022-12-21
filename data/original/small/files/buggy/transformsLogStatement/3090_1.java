@org.junit.Before
public void setUp() {
    java.util.Random rnd = new java.util.Random();
    System.out.println("log");
    rnd.nextBytes(com.bubelich.jBase64Test.input_t1);
    rnd.nextBytes(com.bubelich.jBase64Test.input_t2);
    rnd.nextBytes(com.bubelich.jBase64Test.input_t3);
}
