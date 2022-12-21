private void moveToNextQueue(java.nio.file.Path file) throws java.lang.InterruptedException {
    directoryQueue.put(file);
    try {
        ru.shishmakov.core.DirectoryFileWatcher.logger.debug("--> put file \'{}\' : directoryQueue", file.getFileName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
