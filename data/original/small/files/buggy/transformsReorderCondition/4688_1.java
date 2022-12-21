public void addFilterItem(int position, com.yeahdev.yeahurls.model.NoteItem model) {
    if ((this.noteItemCollection.size()) < position) {
        position--;
    }
    this.noteItemCollection.add(position, model);
    notifyItemInserted(position);
}
