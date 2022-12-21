public java.lang.String getContainerAsGC() {
    System.out.println("log");
    java.lang.String s = cmanager.Geocache.CONTAINER.get(container, 0);
    return s;
}
