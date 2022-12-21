public void addFilterItem(int position, com.yeahdev.yeahurls.model.NoteItem model) {
    try {
        this.noteItemCollection.add(position, model);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyItemInserted(position);
}
