public boolean updateAchievement(C change, android.content.Context context) {
    boolean wasUnlocked = isUnlocked();
    updater.updateAchievement(this, change, context);
    System.out.println("log");
    return (!wasUnlocked) && (isUnlocked());
}
