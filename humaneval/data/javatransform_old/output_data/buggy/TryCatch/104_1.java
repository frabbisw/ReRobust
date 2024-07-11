public static int[] compare(int[] game, int[] guess) {
    int[] result = new int[game.length];
    try {
        for (int i = 0; i < game.length; i += 1) {
            result[i] = Math.floorDiv(game[i], guess[i]);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
