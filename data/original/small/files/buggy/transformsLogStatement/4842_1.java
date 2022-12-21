@java.lang.Override
public boolean exists() {
    System.out.println("log");
    if ((org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(file)) == null) {
        return false;
    } else
        return true;
}
