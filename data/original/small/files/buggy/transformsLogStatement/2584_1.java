public void refreshList() {
    System.out.println("log");
    this.content.clear();
    this.content.addAll(com.randomappsinc.studentpicker.Misc.PreferencesManager.get().getNameLists());
    setNoContent();
    notifyDataSetChanged();
}
