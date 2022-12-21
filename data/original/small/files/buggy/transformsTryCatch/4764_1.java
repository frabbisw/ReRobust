private void initSource() throws java.lang.Exception {
    try {
        if ((dataLine) == null) {
            dataLine = javax.sound.sampled.AudioSystem.getSourceDataLine(af);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
