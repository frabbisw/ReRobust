public void setRoomKey(java.lang.String key) {
    roomKey = key;
    java.lang.System.out.println(roomKey);
    try {
        hostActionParser.setRoomKey(key);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
