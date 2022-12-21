public java.util.ArrayList<com.ocwvar.darkpurple.Bean.SongItem> stopMuiltMode() {
    isMuiltSelecting = false;
    try {
        notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return checkedItems;
}
