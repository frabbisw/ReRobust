public void chatUpdate(java.lang.String text) {
    try {
        taChat.append((text + "\n"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
