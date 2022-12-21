@java.lang.Override
public void receive(sample.complex.ComplexBuffer buffer) {
    System.out.println("log");
    mBuffer.add(buffer);
}
