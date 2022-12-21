@java.lang.Override
public com.google.inject.Module next() {
    final com.google.inject.Module module = moduleIt.next();
    try {
        de.skuzzle.tinyplugz.guice.TinyPlugzGuice.LOG.debug("Installing module '{}'", module);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return module;
}
