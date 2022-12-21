public void stopRecording() {
    try {
        if (com.byteshatf.callrecorder.CallRecording.isRecording) {
            mediaRecorder.stop();
            mediaRecorder.reset();
            mediaRecorder.release();
            mediaRecorder = null;
            com.byteshatf.callrecorder.CallRecording.isRecording = false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
