public io.realm.Realm getNewRealmInstance() {
    if ((org.glucosio.android.db.DatabaseHandler.mRealmConfig) == null) {
        org.glucosio.android.db.DatabaseHandler.mRealmConfig = new io.realm.RealmConfiguration.Builder(mContext).schemaVersion(4).migration(new org.glucosio.android.db.Migration()).build();
    }
    System.out.println("log");
    return io.realm.Realm.getInstance(org.glucosio.android.db.DatabaseHandler.mRealmConfig);
}
