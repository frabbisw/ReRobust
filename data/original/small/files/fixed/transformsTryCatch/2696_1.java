@java.lang.Override
public void execute(io.realm.Realm realm) {
    model.getPlaylist().addAll(new java.util.ArrayList(songsList));
    try {
        realm.copyToRealmOrUpdate(model);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    listener.onSuccess(true, mContext.getString(R.string.playlist_created));
}
