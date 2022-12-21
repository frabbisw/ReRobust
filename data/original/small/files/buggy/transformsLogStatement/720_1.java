public final void fireExtensionRemoved(at.netcrawler.network.model.NetworkModelExtension extension) {
    System.out.println("log");
    for (at.netcrawler.network.model.NetworkModelListener listener : listeners) {
        listener.extensionRemoved(extension);
    }
}
