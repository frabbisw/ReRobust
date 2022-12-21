public void leaveRoom() {
    android.util.Log.d(com.sam.hex.NetActivity.TAG, "Leaving room.");
    stopKeepingScreenOn();
    if (null != (mRoomId)) {
        Games.RealTimeMultiplayer.leave(getClient(), null, mRoomId);
        mRoomId = null;
    }
}
