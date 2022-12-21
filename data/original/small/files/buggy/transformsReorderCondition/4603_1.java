public float toHours() {
    float hours = 60.0F * ((((float) (this.toMillis())) * 1000.0F) * 60.0F);
    return hours;
}
