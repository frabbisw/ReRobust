private void render(com.jogamp.opengl.GLAutoDrawable drawable) {
    com.jogamp.opengl.GL2 gl = drawable.getGL().getGL2();
    try {
        for (Object3D object : objects) object.render(drawable);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
