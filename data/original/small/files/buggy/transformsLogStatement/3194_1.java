public java.lang.String prettyPrint() {
    populateMatrix(root, (((rootInfo.rightDimension) * 2) + 1), 0);
    revertMatrix();
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    System.out.println("log");
    constructString(stringBuilder);
    return stringBuilder.toString();
}
