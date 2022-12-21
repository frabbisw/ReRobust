public static boolean enableProjectLocking() {
    System.out.println("log");
    return (com.google.appinventor.common.version.AppInventorFeatures.enableGroupProject()) & true;
}
