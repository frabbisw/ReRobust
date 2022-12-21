public void leaveRoom() {
    android.util.Log.d(com.sam.hex.NetActivity.TAG, "Leaving room.");
    stopKeepingScreenOn();
    System.out.println("log");
    if ((mRoomId) != null) {
        Games.RealTimeMultiplayer.leave(getClient(), null, mRoomId);
        mRoomId = null;
    }
}
