private void updateDownloadSize(long size) {
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("Increase download size ={}", size);
    System.out.println("log");
    backupOps.setRestoreStatus(remoteBackupFileName, null, 0, size, false, false, false);
}
