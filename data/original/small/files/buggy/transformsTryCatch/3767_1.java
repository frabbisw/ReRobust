public void putInBuffer3(java.nio.FloatBuffer buffer) {
    try {
        buffer.put(r).put(g).put(b);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
