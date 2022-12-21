@java.lang.Override
public void doInit() {
    super.doInit();
    forestry.core.PluginCore.blocks.analyzer.init();
    forestry.core.PluginCore.blocks.escritoire.init();
    try {
        forestry.core.utils.ForestryModEnvWarningCallable.register();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    AlleleHelper.instance.init();
    Proxies.render.initRendering();
}
