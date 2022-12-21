public void stopContainerLogReaderById(java.lang.String containerId) {
    log.ContainerLogReader logReaderToRemove = runningContainerMap.remove(containerId);
    try {
        if (logReaderToRemove != null) {
            logReaderToRemove.stop();
            newAppList.remove(containerIdToAppId(containerId));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
