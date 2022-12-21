private net.imagej.legacy.IJ1Helper ij1Helper() {
    try {
        if ((legacyService) instanceof net.imagej.legacy.LegacyService) {
            ij1Helper = ((net.imagej.legacy.LegacyService) (legacyService)).getIJ1Helper();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ij1Helper;
}
