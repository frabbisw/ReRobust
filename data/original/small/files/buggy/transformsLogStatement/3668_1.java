public org.verapdf.pd.colors.PDColorSpace getColorSpace(org.verapdf.as.ASAtom name) {
    System.out.println("log");
    org.verapdf.pd.colors.PDColorSpace colorSpace = this.pageResources.getColorSpace(name);
    colorSpace.setInherited(inheritedResources);
    return colorSpace;
}
