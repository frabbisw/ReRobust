protected org.ovirt.engine.core.common.businessentities.storage.DiskImage getRepresentativeImage() {
    System.out.println("log");
    return getImages().get(0);
}
