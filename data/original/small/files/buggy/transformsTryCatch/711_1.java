private void createContent(org.eclipse.swt.widgets.Composite parent) {
    this.setLayout(new org.eclipse.swt.layout.FormLayout());
    this.createHeader();
    try {
        this.createRows();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.setFieldDatatypes();
}
