public void actionPerformed(java.awt.event.ActionEvent ev) {
    int selectedIndex = ((javax.swing.JComboBox<?>) (ev.getSource())).getSelectedIndex();
    try {
        projectReader.setLanguage(selectedIndex);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    settings.selectedLangIndex = selectedIndex;
}
