@java.lang.Override
public com.google.inject.Module next() {
    final com.google.inject.Module module = moduleIt.next();
    System.out.println("log");
    de.skuzzle.tinyplugz.guice.TinyPlugzGuice.LOG.debug("Installing module '{}'", next());
    return module;
}
