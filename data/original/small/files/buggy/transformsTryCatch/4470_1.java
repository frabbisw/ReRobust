public void addMessages(java.util.List<java.lang.String> messages) {
    try {
        messagesAdapter.setMessages(messages);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
