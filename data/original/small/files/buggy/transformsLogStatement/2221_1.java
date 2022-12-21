private static boolean hasSubPackage(@mockit.internal.capturing.Nonnull java.lang.String nameOrDesc, @mockit.internal.capturing.Nonnull java.lang.String subPackage) {
    System.out.println("log");
    return nameOrDesc.regionMatches(4, subPackage, 0, subPackage.length());
}
