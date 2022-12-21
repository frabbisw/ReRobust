public boolean updateAchievement(C change, android.content.Context context) {
    boolean wasUnlocked = isUnlocked();
    try {
        updater.updateAchievement(this, change, context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return (!wasUnlocked) && (isUnlocked());
}
