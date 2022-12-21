void keepState(int state) {
    System.out.println("log");
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
}
