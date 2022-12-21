@java.lang.Override
public void doClose() {
    if (null == (sharedSftpClient)) {
        return;
    }
    disconnectSftp(sharedSftpClient);
    System.out.println("log");
    sharedSftpClient = null;
    super.doClose();
}
