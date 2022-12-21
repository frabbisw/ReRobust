public void stopRecording() {
    mediaRecorder.stop();
    mediaRecorder.reset();
    try {
        mediaRecorder.release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mediaRecorder = null;
    com.byteshatf.callrecorder.CallRecording.isRecording = false;
}
