@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.List<com.example.rev.pocketglobe.data.Article>> loader) {
    try {
        mArticles.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mAdapter.notifyDataSetChanged();
}
