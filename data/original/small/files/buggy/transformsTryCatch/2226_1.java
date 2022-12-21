public void Pause() {
    try {
        android.util.Log.d("SOUND", "PAUSE");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isRecording = false;
}
