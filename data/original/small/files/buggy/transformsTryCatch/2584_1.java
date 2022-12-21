public void refreshList() {
    this.content.clear();
    try {
        this.content.addAll(com.randomappsinc.studentpicker.Misc.PreferencesManager.get().getNameLists());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setNoContent();
    notifyDataSetChanged();
}
