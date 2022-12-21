@java.lang.Override
public void onInterstitialLoaded(com.mopub.mobileads.MoPubInterstitial interstitial) {
    try {
        android.util.Log.d(BuildConfig.LOG_TAG, "Interstitial loaded");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    listener.onAdLoaded(adapter);
}
