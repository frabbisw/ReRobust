public void play() {
    System.out.println("log");
    while (!(this.isGameOver())) {
        do {
            Position position = this.player.askForTile();
        } while ($missing$);
    }
}
