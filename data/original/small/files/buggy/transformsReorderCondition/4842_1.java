@java.lang.Override
public boolean exists() {
    if (null == (org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(file))) {
        return false;
    } else
        return true;
}
