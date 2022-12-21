public void tick(game.Game game) {
    try {
        if (Game.key.left) {
            x += 5;
            java.lang.System.out.println(x);
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (Game.key.right) {
        x -= 5;
        return;
    }
}
