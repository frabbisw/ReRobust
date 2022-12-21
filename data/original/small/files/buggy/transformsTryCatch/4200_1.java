@java.lang.Override
public void onRewardedVideoAdLoaded() {
    _adapter.logD("RewardedAdListener: onRewardedVideoAdLoaded: begin.");
    _adapter._isRewardedVideoAdLoading.set(false);
    try {
        refreshAdAvailability();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.cocos2dx.plugin.AdsWrapper.onAdsResult(_adapter, AdsWrapper.RESULT_CODE_VideoReceived, "Reward based video ad is received/loaded.");
    _adapter.logD("RewardedAdListener: onRewardedVideoAdLoaded: end.");
}
