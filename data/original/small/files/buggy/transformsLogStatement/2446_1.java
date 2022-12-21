@org.junit.Test
public void getPrecisionMicroTest() {
    System.out.println("log");
    assertEquals(0.45, de.unima.ki.mamba.evaluation.Characteristic.getPrecisionMicro(this.characteristics), 0);
}
