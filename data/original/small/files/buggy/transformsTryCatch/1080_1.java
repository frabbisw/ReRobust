@java.lang.Override
public void run() {
    try {
        if (!(isStopped)) {
            org.helioviewer.jhv.data.container.cache.JHVEventCache.getSingletonInstance().add(ev);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
