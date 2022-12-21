@java.lang.Override
public void onBeginningOfSpeech() {
    try {
        android.util.Log.d("onBeginningOfSpeech", "onBeginningOfSpeech");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    TTSIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
}
