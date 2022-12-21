public void addMessages(java.util.List<tw.com.triplei.commons.Message> messages) {
    try {
        this.messages.addAll(messages);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
