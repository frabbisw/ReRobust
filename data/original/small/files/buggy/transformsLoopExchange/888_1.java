public void play() {
    for (; !(this.isGameOver()); ) {
        do {
            Position position = this.player.askForTile();
        } while ($missing$);
    }
}
