@org.spongepowered.api.event.Listener
public void onServerStart(org.spongepowered.api.event.game.state.GameStartedServerEvent event) {
    System.out.println("log");
    com.gmail.eliterscripts.CommandManager.registerAll();
    com.gmail.eliterscripts.ConfigManager.instance();
    com.gmail.eliterscripts.ConfigManager.startup();
}
