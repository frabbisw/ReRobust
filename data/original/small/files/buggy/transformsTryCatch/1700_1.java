@java.lang.Override
public net.idik.lib.slimadapter.viewinjector.DefaultViewInjector visibility(int id, int visibility) {
    try {
        findViewById(id).setVisibility(visibility);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
