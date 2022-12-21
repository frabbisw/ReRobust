@java.lang.Override
public boolean isShareActive(org.pieShare.pieShareApp.model.pieFile.FileMeta file) {
    return 0 < (this.sharedFiles.getOrDefault(file.getFile(), 0));
}
