public void addMessage(com.taylorstubbs.whodischat.models.Message message) {
    android.util.Log.d(com.taylorstubbs.whodischat.adapters.MessageAdapter.TAG, "adding message");
    try {
        mMessages.add(message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyDataSetChanged();
}
