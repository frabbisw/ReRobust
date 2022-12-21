private void initSource() throws java.lang.Exception {
    if (null == (dataLine)) {
        dataLine = javax.sound.sampled.AudioSystem.getSourceDataLine(af);
    }
}
