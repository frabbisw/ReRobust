@java.lang.Override
public void doInit() {
    System.out.println("log");
    super.doInit();
    forestry.core.PluginCore.blocks.analyzer.init();
    forestry.core.PluginCore.blocks.escritoire.init();
    forestry.core.utils.ForestryModEnvWarningCallable.register();
    AlleleHelper.instance.init();
    Proxies.render.initRendering();
}
