public void removeEffects() {
    player.removePotionEffect(region.getType());
    player.sendMessage(((region.getName()) + "Removed EFFECTS inside of "));
}
