protected org.ovirt.engine.core.common.businessentities.storage.DiskImage getRepresentativeImage() {
    try {
        if (!(getImages().isEmpty())) {
            return getImages().get(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
