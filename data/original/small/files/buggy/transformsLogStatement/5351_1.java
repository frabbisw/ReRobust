private static int rando(int min, int max) {
    Random rand = new Random();
    System.out.println("log");
    int randomNum = (rand.nextInt(((max - min) + 1))) + min;
    return randomNum;
}
