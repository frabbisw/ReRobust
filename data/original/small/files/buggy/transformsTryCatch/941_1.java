@java.lang.Override
public boolean writeEvent(final de.grau.organizer.classes.Event event) {
    try {
        if (realm.isClosed())
            realm = io.realm.Realm.getDefaultInstance();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    realm.beginTransaction();
    realm.copyToRealmOrUpdate(event);
    realm.commitTransaction();
    return false;
}
