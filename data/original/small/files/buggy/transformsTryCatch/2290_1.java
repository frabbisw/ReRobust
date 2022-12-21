public void onSaved(org.freeplane.features.map.MapModel map) {
    try {
        org.docear.plugin.services.ServiceController.getFeature(org.docear.plugin.services.features.upload.UploadController.class).addMapToUpload(map);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
