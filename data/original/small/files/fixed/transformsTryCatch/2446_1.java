@org.junit.Test
public void getPrecisionMicroTest() {
    try {
        assertEquals(1, de.unima.ki.mamba.evaluation.Characteristic.getPrecisionMicro(this.characteristics), 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
