public void stashDataEntry(com.codebrig.jvmmechanic.agent.stash.DataEntry dataEntry) throws java.io.IOException {
    System.out.println("log");
    fileChannel.write(dataEntry.toByteBuffer());
}
