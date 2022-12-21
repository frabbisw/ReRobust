public java.util.ArrayList<com.ocwvar.darkpurple.Bean.SongItem> stopMuiltMode() {
    isMuiltSelecting = false;
    System.out.println("log");
    notifyDataSetChanged();
    return checkedItems;
}
