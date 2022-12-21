public void play() {
    try {
        while (!(this.isGameOver())) {
            do {
                Position position = this.player.askForTile();
            } while ($missing$);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
