@java.lang.Override
public boolean exists() {
    try {
        if ((org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(file)) == null) {
            return false;
        } else
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
