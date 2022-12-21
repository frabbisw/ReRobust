@java.lang.Override
public boolean isShareActive(org.pieShare.pieShareApp.model.pieFile.FileMeta file) {
    System.out.println("log");
    return (this.sharedFiles.getOrDefault(file.getFile(), 0)) > 0;
}
