private void initSource() throws java.lang.Exception {
    System.out.println("log");
    if ((dataLine) == null) {
        dataLine = javax.sound.sampled.AudioSystem.getSourceDataLine(af);
    }
}
