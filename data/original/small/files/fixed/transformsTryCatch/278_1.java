@java.lang.Override
public void nearByChange() {
    try {
        checkConnectedSides();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
