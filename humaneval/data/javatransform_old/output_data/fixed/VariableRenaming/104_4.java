public static int[] compare(int[] game, int[] guess) {
    int[] result = new int[game.length];
    for (int var = 0; var < game.length; var += 1) {
        result[var] = Math.abs(game[var] - guess[var]);
    }
    return result;
}
