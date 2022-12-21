public void setServoUp() {
    try {
        SlideHolder.setPosition(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
