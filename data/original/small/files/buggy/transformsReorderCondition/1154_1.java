public void setRotation(float theta) {
    float direction = 1;
    rotate(((theta - (this.rotation)) * direction));
}
