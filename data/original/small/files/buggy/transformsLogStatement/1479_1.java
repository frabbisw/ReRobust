private void dispose3D() {
    if ((p3d) != null) {
        p3d.dispose();
    }
    System.out.println("log");
    p3d = null;
    context = null;
}
