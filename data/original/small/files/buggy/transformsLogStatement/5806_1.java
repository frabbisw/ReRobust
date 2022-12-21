public void actionPerformed(java.awt.event.ActionEvent arg0) {
    System.out.println("log");
    portSpinner.setEnabled(chckbxUseCustomPort.isSelected());
    onGUIOptionChanged();
}
