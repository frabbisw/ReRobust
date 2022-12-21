@java.lang.Override
public void nearByChange() {
    checkConnectedSides();
    try {
        getWorld().markBlockForUpdate(getX(), getY(), getZ());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
