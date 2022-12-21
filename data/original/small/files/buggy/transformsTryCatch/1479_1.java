private void dispose3D() {
    try {
        if ((p3d) != null) {
            p3d.dispose();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    p3d = null;
    context = null;
}
