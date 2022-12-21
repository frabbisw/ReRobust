public void setAtPosition(long position, int value) {
    long i = (pointer) + (position * (com.heerbann.unsafe.UnsafeBuffer.sizeOfInt));
    ensure(i);
    try {
        com.heerbann.unsafe.UnsafeBuffer.unsafe.putInt(i, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
