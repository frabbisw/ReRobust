public void insertUpdate(javax.swing.event.DocumentEvent e) {
    try {
        if (comment_set) {
            org.paint.gui.DirtyIndicator.inst().dirtyGenes(comment_set);
            java.lang.String comment = comment_text.getText();
            javax.swing.SwingUtilities.invokeLater(new org.paint.gui.tracking.EvidencePanel.CommentTask(comment));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
