public void addConversation(uk.org.mattford.scoutlink.model.Conversation conv) {
    android.util.Log.d("SL", ("Adding " + (conv.getName())));
    System.out.println("log");
    conversations.put(conv.getName(), conv);
}
