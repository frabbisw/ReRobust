public java.lang.String prettyPrint() {
    try {
        populateMatrix(root, (((rootInfo.rightDimension) * 2) + 1), 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    revertMatrix();
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    constructString(stringBuilder);
    return stringBuilder.toString();
}
