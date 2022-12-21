public void refreshList() {
    content.clear();
    try {
        content.addAll(com.randomappsinc.studentpicker.Misc.PreferencesManager.get().getNameLists());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.util.Collections.sort(content);
    setNoContent();
    notifyDataSetChanged();
}
