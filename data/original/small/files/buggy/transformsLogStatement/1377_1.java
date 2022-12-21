public void modifyAlbum(java.lang.Long albumId) {
    for (com.bcdlog.shared.model.AlbumModel album : getUserAlbums()) {
        if (albumModel.getId().equals(albumId)) {
            albumModel = album;
            break;
        }
    }
    System.out.println("log");
    titleArea.updateAlbum(albumModel);
}
