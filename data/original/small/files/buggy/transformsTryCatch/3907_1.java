@java.lang.Override
public void receive(sample.complex.ComplexBuffer buffer) {
    try {
        mBuffer.add(buffer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
