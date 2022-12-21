private void getJoke() {
    p.printStatus("Getting a random joke.");
    try {
        currentJoke = jokes.get(randIndex());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
