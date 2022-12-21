@org.junit.Test
public final void testGUI() {
    System.out.println("log");
    try {
        new source.GUI();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
