public boolean restore(android.os.Bundle bundle) {
    if (bundle == null) {
        return false;
    }
    try {
        mContentListModel = bundle.getParcelableArrayList(com.stdnull.v2api.model.V2MainFragModel.KEY_V2EXBEAN);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ((mContentListModel) != null) && (!(mContentListModel.isEmpty()));
}
