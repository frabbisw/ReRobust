public void checkHealth(Player player) {
    try {
        java.lang.System.out.println((("Your health is currently at " + (player.Health)) + "health points."));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
