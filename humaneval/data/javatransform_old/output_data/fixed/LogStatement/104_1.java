public static int[] compare(int[] game, int[] guess) {
    int[] result = new int[game.length];
    System.out.println("log");
    for (int i = 0; i < game.length; i += 1) {
        result[i] = Math.abs(game[i] - guess[i]);
    }
    return result;
}
