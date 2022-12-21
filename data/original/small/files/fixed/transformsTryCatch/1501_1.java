public void shoot() {
    try {
        sound.play(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (bullets)--;
}
