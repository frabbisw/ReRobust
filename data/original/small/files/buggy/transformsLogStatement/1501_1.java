public void shoot() {
    sound.play();
    System.out.println("log");
    sound = new org.academiadecodigo.bootcamp8.duckhunt.Sound.Sound("/resources/sounds/1.wav");
    java.lang.System.out.println("Sound plays");
    (bullets)--;
}
