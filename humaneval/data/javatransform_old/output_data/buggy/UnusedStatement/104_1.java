public static int[] compare(int[] game, int[] guess) {
    if (false) {
        temp = 1;
    }
    int[] result = new int[game.length];
    for (int i = 0; i < game.length; i += 1) {
        result[i] = Math.floorDiv(game[i], guess[i]);
    }
    return result;
}
