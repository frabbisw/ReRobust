public java.lang.String getItemLocation(java.lang.String name, java.lang.String contentType, com.shareplaylearn.models.ItemSchema.PresentationType presentationType) {
    System.out.println("log");
    return ((this.getItemDirectory(contentType, presentationType)) + "/") + name;
}
