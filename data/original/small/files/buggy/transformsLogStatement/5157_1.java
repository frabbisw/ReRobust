public void playMidiFile(java.lang.String url) {
    System.out.println("log");
    org.geogebra.common.main.App.debug((((org.geogebra.web.html5.sound.MidiSoundW.PREFIX) + "playing midi file ") + url));
    MidiPlayerW.INSTANCE.playFile(url);
}
