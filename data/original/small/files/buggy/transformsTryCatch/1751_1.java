@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.d(com.pajato.android.gamechat.database.handler.MessagesChangeHandler.TAG, java.lang.String.format(java.util.Locale.US, com.pajato.android.gamechat.database.handler.MessagesChangeHandler.LOG_FORMAT, "onChildRemoved", dataSnapshot, null));
    try {
        process(dataSnapshot, false, com.pajato.android.gamechat.event.MessageChangeEvent.REMOVED);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
