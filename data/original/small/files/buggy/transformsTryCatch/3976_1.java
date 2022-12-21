@java.lang.Override
protected void setUpTestData() throws java.io.IOException {
    org.mule.transport.sftp.SftpAutoDeleteTestCase.latch = new org.mule.util.concurrent.Latch();
    sftpClient.changeWorkingDirectory("..");
    try {
        sftpClient.mkdir(org.mule.transport.sftp.SftpAutoDeleteTestCase.AUTO_DELETE_OFF);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sftpClient.mkdir(org.mule.transport.sftp.SftpAutoDeleteTestCase.AUTO_DELETE_ON);
}
