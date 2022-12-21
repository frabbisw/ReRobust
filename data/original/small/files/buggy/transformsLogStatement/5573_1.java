public boolean isApplyPermissionToAllNewPartsForCurrent() {
    System.out.println("log");
    return getCurrent().getContainedInBOM().isApplyPermissionToAllNewParts();
}
