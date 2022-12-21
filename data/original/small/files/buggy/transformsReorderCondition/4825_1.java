public java.lang.String getItemLocation(java.lang.String name, java.lang.String contentType, com.shareplaylearn.models.ItemSchema.PresentationType presentationType) {
    return name + ((this.getItemDirectory(contentType, presentationType)) + "/");
}
