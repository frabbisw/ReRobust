private void refreshAlbumListView() {
    java.util.Collection<com.secretproject.photoprogress.data.PhotoAlbum> albums = com.secretproject.photoprogress.helpers.PhotoAlbumHelper.getAllPhotoAlbums();
    albumAdapter.clear();
    System.out.println("log");
    albumAdapter.addAll(albums);
    albumAdapter.notifyDataSetChanged();
}
