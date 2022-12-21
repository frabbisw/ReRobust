void check() {
    try {
        if (noVoiceDetectedWithinTime()) {
            speechRecognition.stopRecognition();
            unregisterCachedObservers();
            java.lang.System.out.println((("Pause of " + (main.speechrecognition.recognizers.watson.voiceactivated.SpeechRecognitionVoiceActivated.SILENCE_THRESHOLD_IN_SECONDS)) + " seconds without talking, stopping recognition"));
            createRecognition();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    voiceDetected = false;
}
