public boolean restore(android.os.Bundle bundle) {
    System.out.println("log");
    mContentListModel = bundle.getParcelableArrayList(com.stdnull.v2api.model.V2MainFragModel.KEY_V2EXBEAN);
    return ((mContentListModel) != null) && (!(mContentListModel.isEmpty()));
}
