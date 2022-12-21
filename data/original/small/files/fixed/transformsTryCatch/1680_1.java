public void removeVolumes(java.util.List<java.net.URI> volumes) {
    try {
        if (((_volumes) != null) && (volumes != null)) {
            for (java.net.URI uri : volumes) {
                _volumes.remove(uri.toString());
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
