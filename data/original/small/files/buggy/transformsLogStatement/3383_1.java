public void removeEffects() {
    System.out.println("log");
    player.removePotionEffect(region.getType());
    player.sendMessage(("Removed EFFECTS inside of " + (region.getName())));
}
