public void addConversation(uk.org.mattford.scoutlink.model.Conversation conv) {
    try {
        conversations.put(conv.getName(), conv);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
