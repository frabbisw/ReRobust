private void sendState(com.example.grand.assignment31.State state) {
    android.content.Intent intent = new android.content.Intent(PlayerActivity.FILTER);
    try {
        intent.putExtra(PlayerActivity.PARAM_STATE, state);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
}
