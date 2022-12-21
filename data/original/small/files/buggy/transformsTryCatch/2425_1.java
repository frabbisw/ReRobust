@org.junit.Test
public void longAdditionWorks() {
    long a = 1134903170;
    long b = 1836311903;
    try {
        org.junit.Assert.assertEquals(2971215073L, (a + b));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
