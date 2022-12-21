public static boolean checkUpdates() {
    System.out.println("log");
    return (softwareInfo.version) != (update.update.getUpdatesInfo(update.update.UPDATE_URL).optLong("Version", 0));
}
