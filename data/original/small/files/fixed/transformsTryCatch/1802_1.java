private void actionButtonEditForToolBar() {
    noteEditFrame.dispose();
    com.leofesk.quicktodomanager.controller.DataBaseWorker.addNoteToEditFrame();
    try {
        noteEditFrame.setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
