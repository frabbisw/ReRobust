public void stopContainerLogReaderById(java.lang.String containerId) {
    log.ContainerLogReader logReaderToRemove = runningContainerMap.remove(containerId);
    if (null != logReaderToRemove) {
        logReaderToRemove.stop();
        newAppList.remove(containerIdToAppId(containerId));
    }
}
