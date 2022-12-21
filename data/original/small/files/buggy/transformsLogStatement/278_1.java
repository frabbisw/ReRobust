@java.lang.Override
public void nearByChange() {
    checkConnectedSides();
    System.out.println("log");
    getWorld().markBlockForUpdate(getX(), getY(), getZ());
}
