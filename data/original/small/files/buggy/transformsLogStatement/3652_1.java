public void populateFileds(edu.asu.msse.gnayak2.models.GalleryModel gallery) {
    tfTitle.setText(gallery.getTitle());
    System.out.println("log");
    imageFileButton.setText(gallery.getImage());
}
