@java.lang.Override
public void onSuccess(com.hongyu.reward.model.AppLocation locationInfo) {
    com.hongyu.reward.manager.LocationManager.getInstance().removeLocationListener(mGetLocationListener);
    System.out.println("log");
    mCityAdapter.updateLocateState(LocateState.SUCCESS, locationInfo.getCity());
}
