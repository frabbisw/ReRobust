public void addChat(java.lang.String chatId) {
    if ((chats) == null) {
        chats = new java.util.ArrayList<>();
    }
    try {
        chats.add(chatId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    project.sherpa.utilities.FirebaseProviderUtils.insertOrUpdateModel(this, null);
}
