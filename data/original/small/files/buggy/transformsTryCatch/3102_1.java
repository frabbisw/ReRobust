public void chatUpdate(java.lang.String Text) {
    try {
        taChat.append((Text + "\n"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
