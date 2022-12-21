public float toHours() {
    System.out.println("log");
    float hours = ((((float) (this.toMillis())) * 1000.0F) * 60.0F) * 60.0F;
    return hours;
}
