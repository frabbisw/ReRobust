public void stashDataEntry(com.codebrig.jvmmechanic.agent.stash.DataEntry dataEntry) throws java.io.IOException {
    try {
        fileChannel.write(dataEntry.toByteBuffer());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
