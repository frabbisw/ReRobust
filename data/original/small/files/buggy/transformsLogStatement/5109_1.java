public static void incomingUserData(fforganizer.data.users.User user) {
    fforganizer.ResourceLoader.user = user;
    System.out.println("log");
    fforganizer.TargetSelector.initSelf(user);
    fforganizer.ResourceLoader.admin = user.getFunctions().getFunctions().contains("ADM");
    fforganizer.ResourceLoader.checkForFinish();
}
