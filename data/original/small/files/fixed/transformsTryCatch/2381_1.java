private static void loadConfiguration() {
    com.nicodangelo.lumiere.handler.ConfigurationHandler.testValue = com.nicodangelo.lumiere.handler.ConfigurationHandler.configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "this is an example configuration value");
    try {
        if (com.nicodangelo.lumiere.handler.ConfigurationHandler.configuration.hasChanged()) {
            com.nicodangelo.lumiere.handler.ConfigurationHandler.configuration.save();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
