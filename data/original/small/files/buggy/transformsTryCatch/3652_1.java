public void populateFileds(edu.asu.msse.gnayak2.models.GalleryModel gallery) {
    try {
        tfTitle.setText(gallery.getTitle());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    imageFileButton.setText(gallery.getImage());
}
