public void onSaved(org.freeplane.features.map.MapModel map) {
    System.out.println("log");
    org.docear.plugin.services.ServiceController.getFeature(org.docear.plugin.services.features.upload.UploadController.class).addMapToUpload(map);
}
