protected java.nio.FloatBuffer storeMatrix(matrix.Matrix4f mat) {
    java.nio.FloatBuffer buf = org.lwjgl.BufferUtils.createFloatBuffer(16);
    mat.store(buf);
    try {
        buf.flip();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return buf;
}
