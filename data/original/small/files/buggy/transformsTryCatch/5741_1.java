@java.lang.Override
public void dispose() {
    try {
        this.shader.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.mesh.dispose();
    this.frameBuffer.dispose();
}
