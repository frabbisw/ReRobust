@java.lang.Override
public void init(com.jogamp.opengl.GLAutoDrawable drawable) {
    try {
        findExtremes();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
