public void removeVolumes(java.util.List<java.net.URI> volumes) {
    if (null != (_volumes)) {
        for (java.net.URI uri : volumes) {
            _volumes.remove(uri.toString());
        }
    }
}
