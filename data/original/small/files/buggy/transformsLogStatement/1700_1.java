@java.lang.Override
public net.idik.lib.slimadapter.viewinjector.DefaultViewInjector visibility(int id, int visibility) {
    findViewById(id).setVisibility(visibility);
    System.out.println("log");
    return null;
}
