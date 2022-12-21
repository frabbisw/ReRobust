@java.lang.Override
public void addPages() {
    super.addPages();
    try {
        addPage(fileCreationPage);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addPage(representationCreationPage);
}
