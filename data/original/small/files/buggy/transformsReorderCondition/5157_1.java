public void playMidiFile(java.lang.String url) {
    org.geogebra.common.main.App.debug((url + ((org.geogebra.web.html5.sound.MidiSoundW.PREFIX) + "playing midi file ")));
    MidiPlayerW.INSTANCE.playFile(url);
}
