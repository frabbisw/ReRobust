public void setAtPosition(long position, int value) {
    try {
        ensure(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putInt(((pointer) + position), value);
}
