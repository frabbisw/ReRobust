public void removeEffects() {
    player.removePotionEffect(region.getType());
    try {
        player.sendMessage(("Removed EFFECTS inside of " + (region.getName())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
