@java.lang.Override
public void onInterstitialFailed(com.mopub.mobileads.MoPubInterstitial interstitial, com.mopub.mobileads.MoPubErrorCode errorCode) {
    com.ads.AdInterstitialManager.isReadyAd_2 = false;
    try {
        requestInterstitial_2();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
