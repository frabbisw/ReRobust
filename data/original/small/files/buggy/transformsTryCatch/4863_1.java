public void color(float r, float g, float b, float a) {
    try {
        rend.color(r, g, b, a);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
