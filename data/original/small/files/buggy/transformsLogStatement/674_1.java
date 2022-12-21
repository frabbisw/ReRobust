private void render(com.jogamp.opengl.GLAutoDrawable drawable) {
    System.out.println("log");
    com.jogamp.opengl.GL2 gl = drawable.getGL().getGL2();
    for (Object3D object : objects) object.render(drawable);
}
