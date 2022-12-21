protected void stopScaling() {
    try {
        glPopMatrix();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
