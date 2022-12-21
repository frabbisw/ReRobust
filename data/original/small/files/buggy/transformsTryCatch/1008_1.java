public void startCooldown(cooldown.WavesCooldown cooldown, int rounds) {
    try {
        if (!(resetCooldown(cooldown)))
            THs.add(new cooldown.WavesCDHandler.TimeHelper(cooldown, rounds));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
