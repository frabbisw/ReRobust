@java.lang.Override
public void addPages() {
    super.addPages();
    try {
        addPage(this.fileCreationPage);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addPage(this.representationCreationPage);
}
