public static void main(java.lang.String[] args) {
    wordtrainer.MainMenu.start();
    wordtrainer.Training training = new wordtrainer.Training();
    try {
        training.practice(3);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
