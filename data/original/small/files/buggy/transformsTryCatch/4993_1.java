protected void doGenReport(java.awt.event.ActionEvent ev) {
    java.lang.String s = new net.sf.memoranda.Report(net.sf.memoranda.CurrentProject.getTaskList()).toString(null);
    try {
        javax.swing.JOptionPane.showMessageDialog(this, s, "Project Report", javax.swing.JOptionPane.PLAIN_MESSAGE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
