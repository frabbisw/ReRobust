public void setRoomKey(java.lang.String key) {
    roomKey = key;
    try {
        hostActionParser.setRoomKey(key);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
