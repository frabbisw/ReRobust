private void checkGLError(final java.lang.String message, final boolean throwException) {
    try {
        if (de.lessvoid.coregl.CoreTexture2D.errorChecks) {
            gl.checkGLError(throwException, message);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
