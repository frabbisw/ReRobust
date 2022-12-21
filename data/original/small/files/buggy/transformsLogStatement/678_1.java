private void getJoke() {
    System.out.println("log");
    p.printStatus("Getting a random joke.");
    currentJoke = jokes.get(randIndex());
}
