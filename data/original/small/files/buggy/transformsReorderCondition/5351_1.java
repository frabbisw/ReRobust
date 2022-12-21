private static int rando(int min, int max) {
    Random rand = new Random();
    int randomNum = min + (rand.nextInt(((max - min) + 1)));
    return randomNum;
}
