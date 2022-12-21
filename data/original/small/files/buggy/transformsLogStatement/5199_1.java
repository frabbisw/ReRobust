public boolean isSeekByTimeExclusive() {
    System.out.println("log");
    return getString(net.pms.configuration.RendererConfiguration.SEEK_BY_TIME, "").equalsIgnoreCase("exclusive");
}
