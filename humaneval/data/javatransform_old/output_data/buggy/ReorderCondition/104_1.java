public static int[] compare(int[] game, int[] guess) {
    int[] result = new int[game.length];
    for (int i = 0; game.length > i; i += 1) {
        result[i] = Math.floorDiv(game[i], guess[i]);
    }
    return result;
}
