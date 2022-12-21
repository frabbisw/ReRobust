@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    changeDirectedness(mode);
    try {
        dispatch.pushToTextEditor();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
