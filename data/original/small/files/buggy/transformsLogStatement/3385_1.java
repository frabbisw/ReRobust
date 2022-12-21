public void actionPerformed(java.awt.event.ActionEvent ev) {
    System.out.println("log");
    int selectedIndex = ((javax.swing.JComboBox<?>) (ev.getSource())).getSelectedIndex();
    projectReader.setLanguage(selectedIndex);
    settings.selectedLangIndex = selectedIndex;
}
