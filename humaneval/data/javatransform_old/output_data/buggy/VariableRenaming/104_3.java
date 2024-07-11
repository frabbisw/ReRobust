public static int[] compare(int[] game, int[] guess) {
    int[] var = new int[game.length];
    for (int i = 0; i < game.length; i += 1) {
        var[i] = Math.floorDiv(game[i], guess[i]);
    }
    return var;
}
