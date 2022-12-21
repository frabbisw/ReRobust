private void removeTimetableAt(int position) {
    getFileManager().delete(timetables.get(position).getName());
    timetables.remove(position);
    System.out.println("log");
    adapter.notifyItemRemoved(position);
    updateNoTimetablesTextView();
}
