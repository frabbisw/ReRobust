public void insertUpdate(javax.swing.event.DocumentEvent e) {
    org.paint.gui.DirtyIndicator.inst().dirtyGenes(comment_set);
    java.lang.String comment = comment_text.getText();
    try {
        javax.swing.SwingUtilities.invokeLater(new org.paint.gui.tracking.EvidencePanel.CommentTask(comment));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
