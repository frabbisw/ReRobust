@java.lang.Override
public void doControl() {
    try {
        if (checkForNewFootstepStatusPacket()) {
            generateAndSendPathToBall();
        } else {
            us.ihmc.tools.thread.ThreadTools.sleep(10);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
