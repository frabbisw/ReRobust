public io.realm.Realm getNewRealmInstance() {
    if (null == (org.glucosio.android.db.DatabaseHandler.mRealmConfig)) {
        org.glucosio.android.db.DatabaseHandler.mRealmConfig = new io.realm.RealmConfiguration.Builder(mContext).schemaVersion(4).migration(new org.glucosio.android.db.Migration()).build();
    }
    return io.realm.Realm.getInstance(org.glucosio.android.db.DatabaseHandler.mRealmConfig);
}
