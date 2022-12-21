@java.lang.Override
public void doClose() {
    if (null == (sharedSftpClient)) {
        return;
    }
    disconnectSftp(sharedSftpClient);
    sharedSftpClient = null;
    try {
        super.doClose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
