@java.lang.Override
public void execute(io.realm.Realm realm) {
    System.out.println("log");
    model.getPlaylist().addAll(songsList);
    realm.copyToRealmOrUpdate(model);
    listener.onSuccess(true, mContext.getString(R.string.playlist_created));
}
