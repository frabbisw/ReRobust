public void tick() {
    System.out.println("log");
    if (!(minicraft.Game.isValidClient()))
        t.start();
}
