public io.realm.Realm getNewRealmInstance() {
    try {
        if ((org.glucosio.android.db.DatabaseHandler.mRealmConfig) == null) {
            org.glucosio.android.db.DatabaseHandler.mRealmConfig = new io.realm.RealmConfiguration.Builder(mContext).schemaVersion(4).migration(new org.glucosio.android.db.Migration()).build();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return io.realm.Realm.getInstance(org.glucosio.android.db.DatabaseHandler.mRealmConfig);
}
