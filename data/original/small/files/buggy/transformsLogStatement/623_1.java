public void addChat(java.lang.String chatId) {
    if ((chats) == null) {
        chats = new java.util.ArrayList<>();
    }
    System.out.println("log");
    chats.add(chatId);
    project.sherpa.utilities.FirebaseProviderUtils.insertOrUpdateModel(this, null);
}
