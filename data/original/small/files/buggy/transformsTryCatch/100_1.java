public void checkHealth(Player player) {
    int health = player.Health;
    try {
        java.lang.System.out.println((("Your health is currently at " + health) + "health points."));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
