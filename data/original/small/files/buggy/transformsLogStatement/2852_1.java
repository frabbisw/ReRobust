private net.imagej.legacy.IJ1Helper ij1Helper() {
    System.out.println("log");
    if ((legacyService) instanceof net.imagej.legacy.LegacyService) {
        ij1Helper = ((net.imagej.legacy.LegacyService) (legacyService)).getIJ1Helper();
    }
    return ij1Helper;
}
