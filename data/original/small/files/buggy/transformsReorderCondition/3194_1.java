public java.lang.String prettyPrint() {
    populateMatrix(root, (1 + ((rootInfo.rightDimension) * 2)), 0);
    revertMatrix();
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    constructString(stringBuilder);
    return stringBuilder.toString();
}
