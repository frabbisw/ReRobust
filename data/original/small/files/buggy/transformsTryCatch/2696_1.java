@java.lang.Override
public void execute(io.realm.Realm realm) {
    try {
        model.getPlaylist().addAll(songsList);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    realm.copyToRealmOrUpdate(model);
    listener.onSuccess(true, mContext.getString(R.string.playlist_created));
}
