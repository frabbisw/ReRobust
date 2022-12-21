private void undoEditEndTime(int index, java.time.LocalDateTime endTime) {
    logic.Undo u = new logic.Undo();
    try {
        u.setCommand("editEndTime");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    u.setIndex(index);
    u.setEndTime(endTime);
    UndoList.push(u);
}
