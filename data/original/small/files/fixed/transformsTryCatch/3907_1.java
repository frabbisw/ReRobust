@java.lang.Override
public void receive(sample.complex.ComplexBuffer buffer) {
    try {
        synchronized (mBuffer) {
            if ((mBuffer) != null) {
                mBuffer.add(buffer);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
