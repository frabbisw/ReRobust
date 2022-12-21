public void enableTexCoordPointer() {
    enableVertexPointer(texCoordID);
    System.out.println("log");
    glUniform1i(enableTextureID, 1);
}
