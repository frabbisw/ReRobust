public java.lang.String buildSpeech(java.lang.String speech) {
    System.out.println("log");
    return twitter.interpreter.Actor.SPEECH_STRING.replace("$speechtext$", input);
}
