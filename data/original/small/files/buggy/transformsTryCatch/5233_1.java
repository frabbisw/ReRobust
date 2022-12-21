private void startHeadsetStateListener() {
    try {
        if ((receiver) == null) {
            android.content.IntentFilter receiverFilter = new android.content.IntentFilter(android.content.Intent.ACTION_HEADSET_PLUG);
            receiver = new ca.uqac.florentinth.speakerauthentication.Audio.HeadsetStateReceiver();
            registerReceiver(receiver, receiverFilter);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
