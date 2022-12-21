public void setAtPosition(long position, int value) {
    long i = (position * (com.heerbann.unsafe.UnsafeBuffer.sizeOfInt)) + (pointer);
    ensure(i);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putInt(i, value);
}
