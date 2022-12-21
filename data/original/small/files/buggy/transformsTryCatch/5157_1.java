public void playMidiFile(java.lang.String url) {
    try {
        org.geogebra.common.main.App.debug((((org.geogebra.web.html5.sound.MidiSoundW.PREFIX) + "playing midi file ") + url));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    MidiPlayerW.INSTANCE.playFile(url);
}
