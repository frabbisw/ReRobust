public void checkInMedia(java.util.ArrayList<Media> list, int index) {
    try {
        list.get(index).checkInMedia();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return;
}
