@java.lang.Override
public java.lang.Void apply(com.quran.labs.androidquran.model.bookmark.RecentPageModel.PersistRecentPagesRequest update) throws java.lang.Exception {
    if (null != (update.deleteRangeStart)) {
        bookmarksDBAdapter.replaceRecentRangeWithPage(update.deleteRangeStart, update.deleteRangeEnd, update.page);
    } else {
        bookmarksDBAdapter.addRecentPage(update.page);
    }
    return null;
}
