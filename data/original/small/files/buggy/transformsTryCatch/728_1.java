@java.lang.Override
public void initializeGoApplicationAccessor(com.thoughtworks.go.plugin.api.GoApplicationAccessor goApplicationAccessor) {
    try {
        goPluginIdentifier = componentFactory.goPluginIdentifier();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.goApplicationAccessor = goApplicationAccessor;
    this.handlers = componentFactory.handlers();
}
