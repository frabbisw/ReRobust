public void leaveRoom() {
    android.util.Log.d(com.sam.hex.NetActivity.TAG, "Leaving room.");
    stopKeepingScreenOn();
    try {
        if ((mRoomId) != null) {
            Games.RealTimeMultiplayer.leave(getClient(), null, mRoomId);
            mRoomId = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
