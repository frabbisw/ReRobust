@java.lang.Override
public void controlChange(javax.sound.midi.ShortMessage event) {
    if (_sequencer.isRunning()) {
        if (event.getCommand() == 128) {
        } else if (event.getCommand() == 144) {
            notifyPosition(_sequencer.getTickPosition());
        }
    }
}
