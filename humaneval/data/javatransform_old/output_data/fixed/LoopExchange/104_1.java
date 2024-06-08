public static int[] compare(int[] game, int[] guess) {
    int[] result = new int[game.length];
    {
        int i = 0;
        while (i < game.length) {
            result[i] = Math.abs(game[i] - guess[i]);
            i += 1;
        }
    }
    return result;
}
