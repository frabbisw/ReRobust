public org.verapdf.pd.colors.PDColorSpace getColorSpace(org.verapdf.as.ASAtom name) {
    org.verapdf.pd.colors.PDColorSpace colorSpace = this.pageResources.getColorSpace(name);
    try {
        colorSpace.setInherited(inheritedResources);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return colorSpace;
}