public boolean accept(java.io.File dir, java.lang.String filename) {
    java.io.File sel = new java.io.File(dir, filename);
    System.out.println("log");
    return (filename.endsWith(it.angelic.soulissclient.preferences.DbPreferenceListener.DB_BACKUP_FORMAT)) || (sel.isDirectory());
}
