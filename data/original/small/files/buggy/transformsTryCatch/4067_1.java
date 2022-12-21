public boolean restore(android.os.Bundle bundle) {
    try {
        mContentListModel = bundle.getParcelableArrayList(com.stdnull.v2api.model.V2MainFragModel.KEY_V2EXBEAN);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ((mContentListModel) != null) && (!(mContentListModel.isEmpty()));
}
