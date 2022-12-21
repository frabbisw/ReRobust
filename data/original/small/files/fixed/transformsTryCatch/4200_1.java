@java.lang.Override
public void onRewardedVideoAdLoaded() {
    try {
        _adapter.logD("RewardedAdListener: onRewardedVideoAdLoaded: begin.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    _adapter._isRewardedVideoAdLoading = false;
    refreshAdAvailability();
    org.cocos2dx.plugin.AdsWrapper.onAdsResult(_adapter, AdsWrapper.RESULT_CODE_VideoReceived, "Reward based video ad is received/loaded.");
    _adapter.logD("RewardedAdListener: onRewardedVideoAdLoaded: end.");
}
