public void addConversation(uk.org.mattford.scoutlink.model.Conversation conv) {
    try {
        android.util.Log.d("SL", ("Adding " + (conv.getName())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    conversations.put(conv.getName(), conv);
}
