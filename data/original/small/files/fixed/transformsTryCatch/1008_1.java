public void startCooldown(cooldown.WavesCooldown cooldown, int rounds) {
    try {
        THs.add(new cooldown.WavesCDHandler.TimeHelper(cooldown, rounds));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
