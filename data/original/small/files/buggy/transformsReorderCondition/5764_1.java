@java.lang.Override
public void doClose() {
    if ((sharedSftpClient) == null) {
        return;
    }
    disconnectSftp(sharedSftpClient);
    sharedSftpClient = null;
    super.doClose();
}
