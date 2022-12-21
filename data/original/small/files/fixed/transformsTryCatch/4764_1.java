private void initSource() throws java.lang.Exception {
    try {
        dataLine = javax.sound.sampled.AudioSystem.getSourceDataLine(af);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
