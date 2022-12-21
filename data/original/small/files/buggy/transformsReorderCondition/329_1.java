public void setPhotoUrl(java.lang.String photoUrl) {
    java.lang.String temp = photoUrl.substring(0, ((photoUrl.length()) - 5));
    this.photoUrl = (PHOTO_URL_END) + temp;
}
