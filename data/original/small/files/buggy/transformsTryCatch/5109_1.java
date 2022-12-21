public static void incomingUserData(fforganizer.data.users.User user) {
    fforganizer.ResourceLoader.user = user;
    try {
        fforganizer.TargetSelector.initSelf(user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fforganizer.ResourceLoader.admin = user.getFunctions().getFunctions().contains("ADM");
    fforganizer.ResourceLoader.checkForFinish();
}
