public static boolean checkUpdates() {
    return (update.update.getUpdatesInfo(update.update.UPDATE_URL).optLong("Version", 0)) != (softwareInfo.version);
}
