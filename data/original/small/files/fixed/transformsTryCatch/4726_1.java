public void leaveRoom() {
    try {
        android.util.Log.d(com.sam.hex.NetActivity.TAG, "Leaving room.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stopKeepingScreenOn();
    if ((mRoomId) != null) {
        Games.RealTimeMultiplayer.leave(getClient(), this, mRoomId);
        mRoomId = null;
    }
}
