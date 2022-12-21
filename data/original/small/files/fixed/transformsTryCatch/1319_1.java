@java.lang.Override
public void onSuccess(com.hongyu.reward.model.AppLocation locationInfo) {
    try {
        mCityAdapter.updateLocateState(LocateState.SUCCESS, locationInfo.getCity());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
