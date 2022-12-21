@java.lang.Override
public java.lang.Boolean apply(com.quran.labs.androidquran.model.bookmark.RecentPageModel.PersistRecentPagesRequest update) throws java.lang.Exception {
    try {
        if ((update.deleteRangeStart) != null) {
            bookmarksDBAdapter.replaceRecentRangeWithPage(update.deleteRangeStart, update.deleteRangeEnd, update.page);
        } else {
            bookmarksDBAdapter.addRecentPage(update.page);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
