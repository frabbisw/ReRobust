public void removeEffects() {
    try {
        player.removePotionEffect(region.getType());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
