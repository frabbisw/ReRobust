public void add(kr.iamghost.kurum.AppConfigFileEntry fileEntry) {
    kr.iamghost.kurum.Log.write(fileEntry.getOriginalFile().getAbsolutePath());
    try {
        add(new java.io.File(fileEntry.getOriginalPath()), fileEntry.getDropboxPath(), fileEntry.getExcludeList());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
