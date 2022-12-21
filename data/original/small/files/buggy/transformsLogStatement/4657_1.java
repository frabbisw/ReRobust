@java.lang.Override
public void addPages() {
    System.out.println("log");
    super.addPages();
    addPage(fileCreationPage);
    addPage(representationCreationPage);
}
