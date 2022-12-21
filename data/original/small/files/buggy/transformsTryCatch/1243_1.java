private void actionButtonAddForToolBar(java.awt.event.ActionEvent evt) {
    noteAddFrame.dispose();
    try {
        noteAddFrame.setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
