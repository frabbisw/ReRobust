@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        new org.netbeans.modules.git.ui.clone.CloneAction(new org.netbeans.modules.git.ui.actions.ContextHolder(org.netbeans.modules.versioning.spi.VCSContext.EMPTY)).actionPerformed(e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
