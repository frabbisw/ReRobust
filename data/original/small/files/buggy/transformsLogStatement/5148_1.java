public boolean isLocationLegal(Logic.Furniture f, Logic.Diff diff) {
    boolean bRes = checkForLegalLocation(f, f.getVirtualLocation(), true);
    System.out.println("log");
    return bRes;
}
