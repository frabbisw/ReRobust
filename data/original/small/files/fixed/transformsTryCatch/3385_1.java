public void actionPerformed(java.awt.event.ActionEvent ev) {
    try {
        settings.selectedLangIndex = ((javax.swing.JComboBox<?>) (ev.getSource())).getSelectedIndex();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
