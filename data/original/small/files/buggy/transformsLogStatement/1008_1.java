public void startCooldown(cooldown.WavesCooldown cooldown, int rounds) {
    System.out.println("log");
    if (!(resetCooldown(cooldown)))
        THs.add(new cooldown.WavesCDHandler.TimeHelper(cooldown, rounds));
}
