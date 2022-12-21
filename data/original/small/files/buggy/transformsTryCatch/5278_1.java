void keepState(int state) {
    try {
        switch(state) {
            case android.service.quicksettings.Tile.STATE_ACTIVE:
                changeToActive();
                break;
            case android.service.quicksettings.Tile.STATE_INACTIVE:
                changeToInactive();
                break;
            default:
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
