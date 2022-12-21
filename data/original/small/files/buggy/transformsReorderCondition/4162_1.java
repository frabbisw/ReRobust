private synchronized void addInsert(android.content.ContentValues insert) {
    mDataInsertList.add(insert);
    if ((org.tvbrowser.tvbrowser.TvDataUpdateService.TABLE_OPERATION_MIN_SIZE) < (mDataInsertList.size())) {
        insert(mDataInsertList);
    }
}
