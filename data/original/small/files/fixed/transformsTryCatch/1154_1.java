public void setRotation(float theta) {
    try {
        rotate((theta - (this.rotation)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
