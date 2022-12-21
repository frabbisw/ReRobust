@java.lang.Override
public void doControl() {
    System.out.println("log");
    if (checkForNewFootstepStatusPacket()) {
        generateAndSendPathToBall();
    } else {
        us.ihmc.tools.thread.ThreadTools.sleep(10);
    }
}
