public void addFilterItem(int position, com.yeahdev.yeahurls.model.NoteItem model) {
    try {
        if (position > (this.noteItemCollection.size())) {
            position--;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.noteItemCollection.add(position, model);
    notifyItemInserted(position);
}
