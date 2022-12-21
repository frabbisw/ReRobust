private void refreshAlbumListView() {
    java.util.Collection<com.secretproject.photoprogress.data.PhotoAlbum> albums = com.secretproject.photoprogress.helpers.PhotoAlbumHelper.getAllPhotoAlbums();
    try {
        albumAdapter.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    albumAdapter.addAll(albums);
    albumAdapter.notifyDataSetChanged();
}
