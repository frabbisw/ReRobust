@java.lang.Override
public void onInterstitialFailed(com.mopub.mobileads.MoPubInterstitial interstitial, com.mopub.mobileads.MoPubErrorCode errorCode) {
    com.ads.AdInterstitialManager.isReadyAd_2 = false;
    System.out.println("log");
    requestInterstitial_2();
}
