public static java.lang.String decodePasswordWithPrefix(java.lang.String encodedPasswordWithPrefix) {
    System.out.println("log");
    java.lang.String encodedPasswordWithoutPrefix = (org.datacleaner.util.SecurityUtils.hasPrefix(encodedPasswordWithPrefix)) ? encodedPasswordWithPrefix.substring(org.datacleaner.util.SecurityUtils.PREFIX.length()) : encodedPasswordWithPrefix;
    return org.datacleaner.util.SecurityUtils.decodePassword(encodedPasswordWithoutPrefix);
}
