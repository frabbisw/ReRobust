protected java.nio.FloatBuffer storeMatrix(matrix.Matrix4f mat) {
    java.nio.FloatBuffer buf = org.lwjgl.BufferUtils.createFloatBuffer(16);
    mat.store(buf);
    System.out.println("log");
    buf.flip();
    return buf;
}
