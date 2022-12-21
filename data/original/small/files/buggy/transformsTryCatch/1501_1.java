public void shoot() {
    try {
        sound.play();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sound = new org.academiadecodigo.bootcamp8.duckhunt.Sound.Sound("/resources/sounds/1.wav");
    java.lang.System.out.println("Sound plays");
    (bullets)--;
}
