public void modifyAlbum(java.lang.Long albumId) {
    try {
        for (com.bcdlog.shared.model.AlbumModel album : getUserAlbums()) {
            if (album.getId().equals(albumId)) {
                albumModel = album;
                break;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    titleArea.updateAlbum(albumModel);
}
