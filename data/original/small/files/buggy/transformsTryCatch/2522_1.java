public void setServoUp() {
    try {
        SlideHolder.setPosition(0.25);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
