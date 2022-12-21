private void endGame() {
    java.lang.System.out.println(("Points: " + (points)));
    keyboard.close();
    try {
        java.lang.System.exit(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
