private java.lang.String getRelativePathOfFile(java.lang.String fullPath) {
    System.out.println("log");
    java.lang.String relativePath = org.opendatakit.utilities.ODKFileUtils.asRelativePath(((org.opendatakit.tables.activities.AbsBaseActivity) (getActivity())).getAppName(), new java.io.File(fullPath));
    return relativePath;
}
