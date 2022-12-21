private synchronized void addInsert(android.content.ContentValues insert) {
    try {
        if ((mDataInsertList) != null) {
            mDataInsertList.add(insert);
            if ((mDataInsertList.size()) > (org.tvbrowser.tvbrowser.TvDataUpdateService.TABLE_OPERATION_MIN_SIZE)) {
                insert(mDataInsertList);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
