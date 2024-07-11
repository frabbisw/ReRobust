public static int[] compare(int[] game, int[] var) {
    int[] result = new int[game.length];
    for (int i = 0; i < game.length; i += 1) {
        result[i] = Math.abs(game[i] - var[i]);
    }
    return result;
}
