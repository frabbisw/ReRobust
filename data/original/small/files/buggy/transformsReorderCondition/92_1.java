void check() {
    if (noVoiceDetectedWithinTime()) {
        speechRecognition.stopRecognition();
        unregisterCachedObservers();
        java.lang.System.out.println((" seconds without talking, stopping recognition" + ("Pause of " + (main.speechrecognition.recognizers.watson.voiceactivated.SpeechRecognitionVoiceActivated.SILENCE_THRESHOLD_IN_SECONDS))));
        createRecognition();
    }
    voiceDetected = false;
}
