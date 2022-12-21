public final void setMyLocationEnabled(boolean enabled) {
    mIsMyLocationEnabled = enabled;
    try {
        toggleGps(enabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
