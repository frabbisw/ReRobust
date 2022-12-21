private void updateDownloadSize(long size) {
    try {
        com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("Increase download size ={}", size);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    backupOps.updateDownloadSize(remoteBackupFileName, size);
}
