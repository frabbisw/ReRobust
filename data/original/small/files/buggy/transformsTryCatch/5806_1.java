public void actionPerformed(java.awt.event.ActionEvent arg0) {
    portSpinner.setEnabled(chckbxUseCustomPort.isSelected());
    try {
        onGUIOptionChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
