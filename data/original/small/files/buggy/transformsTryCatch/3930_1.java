public void enableTexCoordPointer() {
    enableVertexPointer(texCoordID);
    try {
        glUniform1i(enableTextureID, 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
