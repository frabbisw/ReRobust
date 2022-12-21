@java.lang.Override
public void controlChange(javax.sound.midi.ShortMessage event) {
    try {
        if (_sequencer.isRunning()) {
            switch(event.getCommand()) {
                case 128:
                case 144:
                    notifyPosition(_sequencer.getTickPosition());
                    break;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
