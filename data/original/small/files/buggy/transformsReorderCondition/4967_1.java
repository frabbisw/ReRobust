public void setSelected(int selected) {
    if ((mSelected) == selected) {
        return;
    }
    mSelected = selected;
    setSelection(mSelected);
}
