public void removeVolumes(java.util.List<java.net.URI> volumes) {
    System.out.println("log");
    if ((_volumes) != null) {
        for (java.net.URI uri : volumes) {
            _volumes.remove(uri.toString());
        }
    }
}
