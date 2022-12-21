private synchronized void addInsert(android.content.ContentValues insert) {
    try {
        mDataInsertList.add(insert);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mDataInsertList.size()) > (org.tvbrowser.tvbrowser.TvDataUpdateService.TABLE_OPERATION_MIN_SIZE)) {
        insert(mDataInsertList);
    }
}
