public void setSelected(int selected) {
    if ((selected == (mSelected)) && (selected == (this.selected))) {
        return;
    }
    mSelected = selected;
    try {
        setSelection(mSelected);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
