@java.lang.Override
public void run() {
    System.out.println("log");
    if (!(isStopped)) {
        org.helioviewer.jhv.data.container.cache.JHVEventCache.getSingletonInstance().add(ev);
    }
}
