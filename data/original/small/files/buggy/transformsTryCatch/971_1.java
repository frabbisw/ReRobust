@org.spongepowered.api.event.Listener
public void onServerStart(org.spongepowered.api.event.game.state.GameStartedServerEvent event) {
    com.gmail.eliterscripts.CommandManager.registerAll();
    com.gmail.eliterscripts.ConfigManager.instance();
    try {
        com.gmail.eliterscripts.ConfigManager.startup();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
