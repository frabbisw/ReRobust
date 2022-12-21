public void setRotation(float theta) {
    float direction = 1;
    try {
        rotate((direction * (theta - (this.rotation))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
