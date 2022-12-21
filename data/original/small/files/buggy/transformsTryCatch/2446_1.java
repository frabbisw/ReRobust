@org.junit.Test
public void getPrecisionMicroTest() {
    try {
        assertEquals(0.45, de.unima.ki.mamba.evaluation.Characteristic.getPrecisionMicro(this.characteristics), 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
