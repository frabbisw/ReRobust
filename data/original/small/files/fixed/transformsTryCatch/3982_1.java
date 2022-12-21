private void removeTimetableAt(int position) {
    getFileManager().delete(timetables.get(position).getId());
    try {
        timetables.remove(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    adapter.notifyItemRemoved(position);
    updateNoTimetablesTextView();
}
