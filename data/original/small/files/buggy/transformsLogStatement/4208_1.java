public void stopRecording() {
    System.out.println("log");
    mediaRecorder.stop();
    mediaRecorder.reset();
    mediaRecorder.release();
    mediaRecorder = null;
    com.byteshatf.callrecorder.CallRecording.isRecording = false;
}
