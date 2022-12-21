@java.lang.Override
public void doInit() {
    try {
        super.doInit();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    forestry.core.PluginCore.blocks.analyzer.init();
    forestry.core.PluginCore.blocks.escritoire.init();
    AlleleHelper.instance.init();
    Proxies.render.initRendering();
}
