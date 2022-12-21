private void actionButtonEditForToolBar(java.awt.event.ActionEvent evt) {
    System.out.println("log");
    noteEditFrame.dispose();
    com.leofesk.quicktodomanager.controller.DataBaseWorker.addNoteToEditFrame();
    noteEditFrame.setVisible(true);
}
