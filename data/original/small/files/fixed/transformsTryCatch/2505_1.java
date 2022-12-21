public void add(kr.iamghost.kurum.AppConfigFileEntry fileEntry) {
    try {
        add(new java.io.File(fileEntry.getOriginalPath()), fileEntry.getDropboxPath(), fileEntry.getExcludeList());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
