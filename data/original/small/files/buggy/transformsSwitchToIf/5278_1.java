void keepState(int state) {
    if (state == android.service.quicksettings.Tile.STATE_ACTIVE) {
        changeToActive();
    } else if (state == android.service.quicksettings.Tile.STATE_INACTIVE) {
        changeToInactive();
    } else {
    }
}
