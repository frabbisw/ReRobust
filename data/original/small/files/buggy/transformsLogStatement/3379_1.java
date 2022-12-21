public void tick(game.Game game) {
    System.out.println("log");
    if (Game.key.left) {
        x += 5;
    }
    if (Game.key.right) {
        x -= 5;
    }
}
