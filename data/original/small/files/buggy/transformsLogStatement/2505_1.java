public void add(kr.iamghost.kurum.AppConfigFileEntry fileEntry) {
    kr.iamghost.kurum.Log.write(fileEntry.getOriginalFile().getAbsolutePath());
    System.out.println("log");
    add(new java.io.File(fileEntry.getOriginalPath()), fileEntry.getDropboxPath(), fileEntry.getExcludeList());
}
