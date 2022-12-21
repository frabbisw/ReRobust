private void removeTimetableAt(int position) {
    try {
        getFileManager().delete(timetables.get(position).getName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    timetables.remove(position);
    adapter.notifyItemRemoved(position);
    updateNoTimetablesTextView();
}
