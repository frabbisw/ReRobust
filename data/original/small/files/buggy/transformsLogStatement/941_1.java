@java.lang.Override
public boolean writeEvent(final de.grau.organizer.classes.Event event) {
    System.out.println("log");
    if (realm.isClosed())
        realm = io.realm.Realm.getDefaultInstance();
    realm.beginTransaction();
    realm.copyToRealmOrUpdate(event);
    realm.commitTransaction();
    return false;
}
