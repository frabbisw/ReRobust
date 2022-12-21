public void setAdapter(java.lang.Class<?> adapterType, java.lang.Object adapter) {
    try {
        synchronized (adapters) {
            adapters.put(adapterType, adapter);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
