public void setPlayerClass(tk.martijn_heil.kingdomkits.model.PlayerClass playerClass, boolean withCoolDown) {
    try {
        this.setPlayerClass(playerClass, withCoolDown, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
