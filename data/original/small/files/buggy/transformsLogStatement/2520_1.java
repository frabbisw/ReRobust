private void checkGLError(final java.lang.String message, final boolean throwException) {
    System.out.println("log");
    if (de.lessvoid.coregl.CoreTexture2D.errorChecks) {
        gl.checkGLError(message, throwException);
    }
}
