public final void fireExtensionRemoved(at.netcrawler.network.model.NetworkModelExtension extension) {
    try {
        for (at.netcrawler.network.model.NetworkModelListener listener : listeners) {
            listener.extensionRemoved(extension);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
