public void enableTexCoordPointer() {
    if ((texCoordID) != (-1))
        enableVertexPointer(texCoordID);
    try {
        glUniform1i(enableTextureID, 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
