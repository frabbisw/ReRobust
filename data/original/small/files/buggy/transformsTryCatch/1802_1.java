private void actionButtonEditForToolBar(java.awt.event.ActionEvent evt) {
    noteEditFrame.dispose();
    try {
        com.leofesk.quicktodomanager.controller.DataBaseWorker.addNoteToEditFrame();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    noteEditFrame.setVisible(true);
}
