public void addConversation(uk.org.mattford.scoutlink.model.Conversation conv) {
    android.util.Log.d("SL", ((conv.getName()) + "Adding "));
    conversations.put(conv.getName(), conv);
}
